package com.project.service.impl;

import com.project.controller.LoginModel;

import com.project.dao.*;

import com.project.model.*;

import com.project.service.*;

import com.project.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.ui.ModelMap;

import java.io.IOException;
import java.io.InputStream;

import java.text.SimpleDateFormat;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Service
public class StuApplyLogServiceImpl implements StuApplyLogService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    StuApplyLogMapper stuApplyLogMapper;
    @Autowired
    TeacherInfoMapper teacherInfoMapper;
    @Autowired
    StudentInfoMapper studentInfoMapper;

    /**
      选择导师
    */
    @Override
    public String selectTurtor(StuApplyLog model, LoginModel login) {
        if ((model.getProjectTitle() == null) ||
                model.getProjectTitle().equals("")) {
            return "项目题目为必填属性";
        }

        if ((model.getProjectIntro() == null) ||
                model.getProjectIntro().equals("")) {
            return "项目介绍为必填属性";
        }

        if ((model.getProfile() == null) || model.getProfile().equals("")) {
            return "相关文件为必填属性";
        }

        if (model.getProfile() != null) {
            String[] fileSplit = model.getProfile().split(";");

            if (fileSplit.length > 1) {
                return "相关文件的文件数量不能大于1";
            }
        }

        if ((model.getStuRemark() == null) || model.getStuRemark().equals("")) {
            return "学生备注为必填属性";
        }

        model.setStuId(login.getId()); //登录id
        model.setSelectStatus(1); //默认已申请,
        model.setCreateTime(sdf1.format(new Date())); //当前时间格式
        stuApplyLogMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      取消
    */
    @Override
    public String qx(StuApplyLog model, LoginModel login) {
        StuApplyLog preModel = stuApplyLogMapper.selectByPrimaryKey(model.getId());

        if ((model.getStuRemark() == null) || model.getStuRemark().equals("")) {
            return "学生备注为必填属性";
        }

        preModel.setSelectStatus(4); //申请状态设置为已取消
        preModel.setStuRemark(model.getStuRemark());
        stuApplyLogMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
      同意申请
    */
    @Override
    public String ty(StuApplyLog model, LoginModel login) {
        StuApplyLog preModel = stuApplyLogMapper.selectByPrimaryKey(model.getId());

        if ((model.getTeacherRemark() == null) ||
                model.getTeacherRemark().equals("")) {
            return "导师备注为必填属性";
        }

        preModel.setSelectStatus(2); //申请状态设置为已同意申请
        preModel.setTeacherRemark(model.getTeacherRemark());
        stuApplyLogMapper.updateByPrimaryKey(preModel); //更新数据
        
        
        StudentInfo stu = studentInfoMapper.selectByPrimaryKey(preModel.getStuId());
        if(stu.getHaveTurtor()==2){
        	return "该学生已被其他导师选择，不能执行该操作";
        }
        stu.setHaveTurtor(2);
        studentInfoMapper.updateByPrimaryKeySelective(stu);
        TeacherInfo teacher = teacherInfoMapper.selectByPrimaryKey(preModel.getTeacherId());
        teacher.setSelectedNum(teacher.getSelectedNum()+1);
        teacherInfoMapper.updateByPrimaryKeySelective(teacher);

        return "";
    }

    /**
      拒绝申请
    */
    @Override
    public String jj(StuApplyLog model, LoginModel login) {
        StuApplyLog preModel = stuApplyLogMapper.selectByPrimaryKey(model.getId());

        if ((model.getTeacherRemark() == null) ||
                model.getTeacherRemark().equals("")) {
            return "导师备注为必填属性";
        }

        preModel.setSelectStatus(3); //申请状态设置为已拒绝申请
        preModel.setTeacherRemark(model.getTeacherRemark());
        stuApplyLogMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询学生项目申请列表数据
    */
    @Override
    public Map<String, Object> getDataList(StuApplyLog queryModel,
        Integer page, Integer pageSize, LoginModel login) {
        StuApplyLogExample se = new StuApplyLogExample();
        StuApplyLogExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getSelectStatus() != null) {
            sc.andSelectStatusEqualTo(queryModel.getSelectStatus());
        }

        if (queryModel.getTeacherId() != null) {
            sc.andTeacherIdEqualTo(queryModel.getTeacherId());
        }

        if ((queryModel.getProjectTitle() != null) &&
                (queryModel.getProjectTitle().equals("") == false)) {
            sc.andProjectTitleLike("%" + queryModel.getProjectTitle() + "%"); //模糊查询
        }

        if (queryModel.getStuId() != null) {
            sc.andStuIdEqualTo(queryModel.getStuId()); //查询学生ID等于指定值
        }

        int count = (int) stuApplyLogMapper.countByExample(se);
        int totalPage = 0;

        if ((page != null) && (pageSize != null)) { //分页

            if ((count > 0) && ((count % pageSize) == 0)) {
                totalPage = count / pageSize;
            } else {
                totalPage = (count / pageSize) + 1;
            }

            se.setPageRows(pageSize);
            se.setStartRow((page - 1) * pageSize);
        }

        List<StuApplyLog> list = stuApplyLogMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (StuApplyLog model : list) {
            list2.add(getStuApplyLogModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装学生项目申请为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getStuApplyLogModel(StuApplyLog model,
        LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("stuApplyLog", model);

        if (model.getTeacherId() != null) {
            TeacherInfo teacherInfo = teacherInfoMapper.selectByPrimaryKey(model.getTeacherId()); //导师ID为外接字段,需要关联导师来解释该字段

            if (teacherInfo != null) {
                map.put("teacherIdStr",
                    teacherInfo.getTno() + "," + teacherInfo.getRealName());
            }
        }

        if (model.getStuId() != null) {
            StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(model.getStuId()); //学生ID为外接字段,需要关联学生来解释该字段

            if (studentInfo != null) {
                map.put("stuIdStr",
                    studentInfo.getStuNo() + "," + studentInfo.getRealName());
            }
        }

        map.put("selectStatusStr",
            DataListUtils.getSelectStatusNameById(model.getSelectStatus() + "")); //解释申请状态字段

        return map;
    }
}

