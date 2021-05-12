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
public class TeacherInfoServiceImpl implements TeacherInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    TeacherInfoMapper teacherInfoMapper;
    @Autowired
    CollegeInfoMapper collegeInfoMapper;
    @Autowired
    ResearchInfoMapper researchInfoMapper;
    @Autowired
    StudentInfoMapper studentInfoMapper;

    /**
      新增
    */
    @Override
    public String add(TeacherInfo model, LoginModel login) {
        if ((model.getTno() == null) || model.getTno().equals("")) {
            return "工号为必填属性";
        }

        if (model.getTno() != null) {
            TeacherInfoExample te = new TeacherInfoExample();
            TeacherInfoExample.Criteria tc = te.createCriteria();
            tc.andTnoEqualTo(model.getTno());

            int count = (int) teacherInfoMapper.countByExample(te);

            if (count > 0) {
                return "系统已存在该 工号 ,请重新填写";
            }
        }

        if ((model.getPassword() == null) || model.getPassword().equals("")) {
            return "密码为必填属性";
        }

        if ((model.getRealName() == null) || model.getRealName().equals("")) {
            return "姓名为必填属性";
        }

        if ((model.getCelPhone() == null) || model.getCelPhone().equals("")) {
            return "联系电话为必填属性";
        }

        if (model.getCelPhone() != null) {
            Pattern p = Pattern.compile(
                    "^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
            Matcher m = p.matcher(model.getCelPhone());

            if (m.matches() == false) {
                return "请输入正确的联系电话";
            }
        }

        if ((model.getEmail() == null) || model.getEmail().equals("")) {
            return "邮箱为必填属性";
        }

        if (model.getEmail() != null) {
            Pattern p = Pattern.compile(
                    "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
            Matcher m = p.matcher(model.getEmail());

            if (m.matches() == false) {
                return "请输入正确的邮箱";
            }
        }

        if ((model.getPersonalIntro() == null) ||
                model.getPersonalIntro().equals("")) {
            return "教学简介为必填属性";
        }

        if ((model.getHeadImg() == null) || model.getHeadImg().equals("")) {
            return "电子照片为必填属性";
        }

        if (model.getHeadImg() != null) {
            String[] fileSplit = model.getHeadImg().split(";");

            if (fileSplit.length > 1) {
                return "电子照片的图片数量不能大于1";
            }
        }

        if (model.getSex() == null) {
            return "性别为必填属性";
        }

        if ((model.getJobName() == null) || model.getJobName().equals("")) {
            return "职称为必填属性";
        }

        if (model.getIsSelect() == null) {
            return "是否可选为必填属性";
        }

        if (model.getCollegeId() == null) {
            return "所属学院为必填属性";
        }

        if (model.getResearchId() == null) {
            return "研究方向为必填属性";
        }

        model.setSelectedNum(0); //默认0
        teacherInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update(TeacherInfo model, LoginModel login) {
        TeacherInfo preModel = teacherInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getTno() == null) || model.getTno().equals("")) {
            return "工号为必填属性";
        }

        if (model.getTno() != null) {
            TeacherInfoExample te = new TeacherInfoExample();
            TeacherInfoExample.Criteria tc = te.createCriteria();
            tc.andTnoEqualTo(model.getTno());
            tc.andIdNotEqualTo(model.getId());

            int count = (int) teacherInfoMapper.countByExample(te);

            if (count > 0) {
                return "系统已存在该 工号 ,请重新填写";
            }
        }

        if ((model.getPassword() == null) || model.getPassword().equals("")) {
            return "密码为必填属性";
        }

        if ((model.getRealName() == null) || model.getRealName().equals("")) {
            return "姓名为必填属性";
        }

        if ((model.getCelPhone() == null) || model.getCelPhone().equals("")) {
            return "联系电话为必填属性";
        }

        if (model.getCelPhone() != null) {
            Pattern p = Pattern.compile(
                    "^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
            Matcher m = p.matcher(model.getCelPhone());

            if (m.matches() == false) {
                return "请输入正确的联系电话";
            }
        }

        if ((model.getEmail() == null) || model.getEmail().equals("")) {
            return "邮箱为必填属性";
        }

        if (model.getEmail() != null) {
            Pattern p = Pattern.compile(
                    "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
            Matcher m = p.matcher(model.getEmail());

            if (m.matches() == false) {
                return "请输入正确的邮箱";
            }
        }

        if ((model.getPersonalIntro() == null) ||
                model.getPersonalIntro().equals("")) {
            return "教学简介为必填属性";
        }

        if ((model.getHeadImg() == null) || model.getHeadImg().equals("")) {
            return "电子照片为必填属性";
        }

        if (model.getHeadImg() != null) {
            String[] fileSplit = model.getHeadImg().split(";");

            if (fileSplit.length > 1) {
                return "电子照片的图片数量不能大于1";
            }
        }

        if (model.getSex() == null) {
            return "性别为必填属性";
        }

        if ((model.getJobName() == null) || model.getJobName().equals("")) {
            return "职称为必填属性";
        }

        if (model.getIsSelect() == null) {
            return "是否可选为必填属性";
        }

        if (model.getCollegeId() == null) {
            return "所属学院为必填属性";
        }

        if (model.getResearchId() == null) {
            return "研究方向为必填属性";
        }

        preModel.setTno(model.getTno());
        preModel.setPassword(model.getPassword());
        preModel.setRealName(model.getRealName());
        preModel.setCelPhone(model.getCelPhone());
        preModel.setEmail(model.getEmail());
        preModel.setPersonalIntro(model.getPersonalIntro());
        preModel.setHeadImg(model.getHeadImg());
        preModel.setSex(model.getSex());
        preModel.setJobName(model.getJobName());
        preModel.setIsSelect(model.getIsSelect());
        preModel.setCollegeId(model.getCollegeId());
        preModel.setResearchId(model.getResearchId());
        teacherInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update2(TeacherInfo model, LoginModel login) {
        TeacherInfo preModel = teacherInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getCelPhone() == null) || model.getCelPhone().equals("")) {
            return "联系电话为必填属性";
        }

        if (model.getCelPhone() != null) {
            Pattern p = Pattern.compile(
                    "^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
            Matcher m = p.matcher(model.getCelPhone());

            if (m.matches() == false) {
                return "请输入正确的联系电话";
            }
        }

        if ((model.getEmail() == null) || model.getEmail().equals("")) {
            return "邮箱为必填属性";
        }

        if (model.getEmail() != null) {
            Pattern p = Pattern.compile(
                    "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
            Matcher m = p.matcher(model.getEmail());

            if (m.matches() == false) {
                return "请输入正确的邮箱";
            }
        }

        if ((model.getPersonalIntro() == null) ||
                model.getPersonalIntro().equals("")) {
            return "教学简介为必填属性";
        }

        if ((model.getHeadImg() == null) || model.getHeadImg().equals("")) {
            return "电子照片为必填属性";
        }

        if (model.getHeadImg() != null) {
            String[] fileSplit = model.getHeadImg().split(";");

            if (fileSplit.length > 1) {
                return "电子照片的图片数量不能大于1";
            }
        }

        preModel.setCelPhone(model.getCelPhone());
        preModel.setEmail(model.getEmail());
        preModel.setPersonalIntro(model.getPersonalIntro());
        preModel.setHeadImg(model.getHeadImg());
        teacherInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询导师列表数据
    */
    @Override
    public Map<String, Object> getDataList(TeacherInfo queryModel,
        Integer page, Integer pageSize, LoginModel login) {
        TeacherInfoExample se = new TeacherInfoExample();
        TeacherInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if ((queryModel.getTno() != null) &&
                (queryModel.getTno().equals("") == false)) {
            sc.andTnoLike("%" + queryModel.getTno() + "%"); //模糊查询
        }

        if ((queryModel.getRealName() != null) &&
                (queryModel.getRealName().equals("") == false)) {
            sc.andRealNameLike("%" + queryModel.getRealName() + "%"); //模糊查询
        }

        if (queryModel.getIsSelect() != null) {
            sc.andIsSelectEqualTo(queryModel.getIsSelect()); //查询是否可选等于指定值
        }

        if (queryModel.getCollegeId() != null) {
            sc.andCollegeIdEqualTo(queryModel.getCollegeId()); //查询所属学院等于指定值
        }

        if (queryModel.getId() != null) {
            sc.andIdEqualTo(queryModel.getId());
        }

        int count = (int) teacherInfoMapper.countByExample(se);
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

        List<TeacherInfo> list = teacherInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (TeacherInfo model : list) {
            list2.add(getTeacherInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装导师为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getTeacherInfoModel(TeacherInfo model,
        LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("teacherInfo", model);
        map.put("sexStr", DataListUtils.getSexNameById(model.getSex() + "")); //解释性别字段
        map.put("isSelectStr",
            DataListUtils.getIsSelectNameById(model.getIsSelect() + "")); //解释是否可选字段

        if (model.getCollegeId() != null) {
            CollegeInfo collegeInfo = collegeInfoMapper.selectByPrimaryKey(model.getCollegeId()); //所属学院为外接字段,需要关联学院来解释该字段

            if (collegeInfo != null) {
                map.put("collegeIdStr", collegeInfo.getCname());
            }
        }

        if (model.getResearchId() != null) {
            ResearchInfo researchInfo = researchInfoMapper.selectByPrimaryKey(model.getResearchId()); //研究方向为外接字段,需要关联研究方向来解释该字段

            if (researchInfo != null) {
                map.put("researchIdStr", researchInfo.getRname());
            }
        }
        int canSelect=0;
        if(login.getLoginType()==3){
        	StudentInfo stu = studentInfoMapper.selectByPrimaryKey(login.getId());
        	if(stu.getHaveTurtor()==1&&model.getIsSelect()==1){
        		canSelect=1;
        	}
        }
        map.put("canSelect", canSelect);
        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        teacherInfoMapper.deleteByPrimaryKey(id);
    }
}

