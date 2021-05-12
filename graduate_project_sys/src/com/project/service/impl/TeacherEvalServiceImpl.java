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
public class TeacherEvalServiceImpl implements TeacherEvalService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    TeacherEvalMapper teacherEvalMapper;
    @Autowired
    StuApplyLogMapper stuApplyLogMapper;
    @Autowired
    StudentInfoMapper studentInfoMapper;
    @Autowired
    TeacherInfoMapper teacherInfoMapper;

    /**
      新增
    */
    @Override
    public String add(TeacherEval model, LoginModel login) {
        if ((model.getIdeologicalmoral() == null) ||
                model.getIdeologicalmoral().equals("")) {
            return "思想品德为必填属性";
        }

        if ((model.getLearningability() == null) ||
                model.getLearningability().equals("")) {
            return "学习能力为必填属性";
        }

        if ((model.getProfessionalSkills() == null) ||
                model.getProfessionalSkills().equals("")) {
            return "专业技能为必填属性";
        }

        if ((model.getPractive() == null) || model.getPractive().equals("")) {
            return "实践为必填属性";
        }

        if (model.getPapergrade() == null) {
            return "论文成绩为必填属性";
        }

        model.setCreateTime(sdf1.format(new Date())); //当前时间格式
        model.setTeacherId(login.getId()); //登录id

        StuApplyLog stuApplyLog = stuApplyLogMapper.selectByPrimaryKey(model.getProjectId()); //查询学生项目申请供以下填入其他字段

        if (stuApplyLog != null) {
            model.setStuId(stuApplyLog.getStuId());
        }

        teacherEvalMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update(TeacherEval model, LoginModel login) {
        TeacherEval preModel = teacherEvalMapper.selectByPrimaryKey(model.getId());

        if ((model.getIdeologicalmoral() == null) ||
                model.getIdeologicalmoral().equals("")) {
            return "思想品德为必填属性";
        }

        if ((model.getLearningability() == null) ||
                model.getLearningability().equals("")) {
            return "学习能力为必填属性";
        }

        if ((model.getProfessionalSkills() == null) ||
                model.getProfessionalSkills().equals("")) {
            return "专业技能为必填属性";
        }

        if ((model.getPractive() == null) || model.getPractive().equals("")) {
            return "实践为必填属性";
        }

        if (model.getPapergrade() == null) {
            return "论文成绩为必填属性";
        }

        preModel.setIdeologicalmoral(model.getIdeologicalmoral());
        preModel.setLearningability(model.getLearningability());
        preModel.setProfessionalSkills(model.getProfessionalSkills());
        preModel.setPractive(model.getPractive());
        preModel.setPapergrade(model.getPapergrade());
        teacherEvalMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询学业评分列表数据
    */
    @Override
    public Map<String, Object> getDataList(TeacherEval queryModel,
        Integer page, Integer pageSize, LoginModel login) {
        TeacherEvalExample se = new TeacherEvalExample();
        TeacherEvalExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getProjectId() != null) {
            sc.andProjectIdEqualTo(queryModel.getProjectId());
        }

        int count = (int) teacherEvalMapper.countByExample(se);
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

        List<TeacherEval> list = teacherEvalMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (TeacherEval model : list) {
            list2.add(getTeacherEvalModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装学业评分为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getTeacherEvalModel(TeacherEval model,
        LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("teacherEval", model);

        if (model.getProjectId() != null) {
            StuApplyLog stuApplyLog = stuApplyLogMapper.selectByPrimaryKey(model.getProjectId()); //项目ID为外接字段,需要关联学生项目申请来解释该字段

            if (stuApplyLog != null) {
                map.put("projectIdStr", stuApplyLog.getProjectTitle());
            }
        }

        if (model.getStuId() != null) {
            StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(model.getStuId()); //评价学生为外接字段,需要关联学生来解释该字段

            if (studentInfo != null) {
                map.put("stuIdStr",
                    studentInfo.getStuNo() + "," + studentInfo.getRealName());
            }
        }

        if (model.getTeacherId() != null) {
            TeacherInfo teacherInfo = teacherInfoMapper.selectByPrimaryKey(model.getTeacherId()); //导师ID为外接字段,需要关联导师来解释该字段

            if (teacherInfo != null) {
                map.put("teacherIdStr",
                    teacherInfo.getTno() + "," + teacherInfo.getRealName());
            }
        }

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        teacherEvalMapper.deleteByPrimaryKey(id);
    }
}

