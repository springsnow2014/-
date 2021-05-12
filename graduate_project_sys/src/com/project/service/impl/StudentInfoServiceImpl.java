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
public class StudentInfoServiceImpl implements StudentInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    StudentInfoMapper studentInfoMapper;
    @Autowired
    CollegeInfoMapper collegeInfoMapper;
    @Autowired
    ClassInfoMapper classInfoMapper;
    @Autowired
    ResearchInfoMapper researchInfoMapper;
    @Autowired
    GradeInfoMapper gradeInfoMapper;
    @Autowired
    TermInfoMapper termInfoMapper;

    /**
      新增
    */
    @Override
    public String add(StudentInfo model, LoginModel login) {
        if ((model.getStuNo() == null) || model.getStuNo().equals("")) {
            return "学号为必填属性";
        }

        if (model.getStuNo() != null) {
            StudentInfoExample te = new StudentInfoExample();
            StudentInfoExample.Criteria tc = te.createCriteria();
            tc.andStuNoEqualTo(model.getStuNo());

            int count = (int) studentInfoMapper.countByExample(te);

            if (count > 0) {
                return "系统已存在该 学号 ,请重新填写";
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

        if (model.getCollegeId() == null) {
            return "所属学院为必填属性";
        }

        if (model.getClassId() == null) {
            return "班级为必填属性";
        }

        if (model.getResearchId() == null) {
            return "研究方向为必填属性";
        }

        if (model.getGradeId() == null) {
            return "年级为必填属性";
        }

        if (model.getTermId() == null) {
            return "学期为必填属性";
        }

        model.setHaveTurtor(1); //默认未有导师,
        studentInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update(StudentInfo model, LoginModel login) {
        StudentInfo preModel = studentInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getStuNo() == null) || model.getStuNo().equals("")) {
            return "学号为必填属性";
        }

        if (model.getStuNo() != null) {
            StudentInfoExample te = new StudentInfoExample();
            StudentInfoExample.Criteria tc = te.createCriteria();
            tc.andStuNoEqualTo(model.getStuNo());
            tc.andIdNotEqualTo(model.getId());

            int count = (int) studentInfoMapper.countByExample(te);

            if (count > 0) {
                return "系统已存在该 学号 ,请重新填写";
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

        if (model.getCollegeId() == null) {
            return "所属学院为必填属性";
        }

        if (model.getClassId() == null) {
            return "班级为必填属性";
        }

        if (model.getResearchId() == null) {
            return "研究方向为必填属性";
        }

        if (model.getGradeId() == null) {
            return "年级为必填属性";
        }

        if (model.getTermId() == null) {
            return "学期为必填属性";
        }

        preModel.setStuNo(model.getStuNo());
        preModel.setPassword(model.getPassword());
        preModel.setRealName(model.getRealName());
        preModel.setCelPhone(model.getCelPhone());
        preModel.setEmail(model.getEmail());
        preModel.setHeadImg(model.getHeadImg());
        preModel.setSex(model.getSex());
        preModel.setCollegeId(model.getCollegeId());
        preModel.setClassId(model.getClassId());
        preModel.setResearchId(model.getResearchId());
        preModel.setGradeId(model.getGradeId());
        preModel.setTermId(model.getTermId());
        studentInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update2(StudentInfo model, LoginModel login) {
        StudentInfo preModel = studentInfoMapper.selectByPrimaryKey(model.getId());

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
        preModel.setHeadImg(model.getHeadImg());
        studentInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询学生列表数据
    */
    @Override
    public Map<String, Object> getDataList(StudentInfo queryModel,
        Integer page, Integer pageSize, LoginModel login) {
        StudentInfoExample se = new StudentInfoExample();
        StudentInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if ((queryModel.getStuNo() != null) &&
                (queryModel.getStuNo().equals("") == false)) {
            sc.andStuNoLike("%" + queryModel.getStuNo() + "%"); //模糊查询
        }

        if ((queryModel.getRealName() != null) &&
                (queryModel.getRealName().equals("") == false)) {
            sc.andRealNameLike("%" + queryModel.getRealName() + "%"); //模糊查询
        }

        if (queryModel.getHaveTurtor() != null) {
            sc.andHaveTurtorEqualTo(queryModel.getHaveTurtor()); //查询是否有导师等于指定值
        }

        if (queryModel.getCollegeId() != null) {
            sc.andCollegeIdEqualTo(queryModel.getCollegeId()); //查询所属学院等于指定值
        }

        if (queryModel.getId() != null) {
            sc.andIdEqualTo(queryModel.getId());
        }

        int count = (int) studentInfoMapper.countByExample(se);
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

        List<StudentInfo> list = studentInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (StudentInfo model : list) {
            list2.add(getStudentInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装学生为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getStudentInfoModel(StudentInfo model,
        LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("studentInfo", model);
        map.put("sexStr", DataListUtils.getSexNameById(model.getSex() + "")); //解释性别字段
        map.put("haveTurtorStr",
            DataListUtils.getHaveTurtorNameById(model.getHaveTurtor() + "")); //解释是否有导师字段

        if (model.getCollegeId() != null) {
            CollegeInfo collegeInfo = collegeInfoMapper.selectByPrimaryKey(model.getCollegeId()); //所属学院为外接字段,需要关联学院来解释该字段

            if (collegeInfo != null) {
                map.put("collegeIdStr", collegeInfo.getCname());
            }
        }

        if (model.getClassId() != null) {
            ClassInfo classInfo = classInfoMapper.selectByPrimaryKey(model.getClassId()); //班级为外接字段,需要关联班级来解释该字段

            if (classInfo != null) {
                map.put("classIdStr", classInfo.getClassName());
            }
        }

        if (model.getResearchId() != null) {
            ResearchInfo researchInfo = researchInfoMapper.selectByPrimaryKey(model.getResearchId()); //研究方向为外接字段,需要关联研究方向来解释该字段

            if (researchInfo != null) {
                map.put("researchIdStr", researchInfo.getRname());
            }
        }

        if (model.getGradeId() != null) {
            GradeInfo gradeInfo = gradeInfoMapper.selectByPrimaryKey(model.getGradeId()); //年级为外接字段,需要关联年级来解释该字段

            if (gradeInfo != null) {
                map.put("gradeIdStr", gradeInfo.getGname());
            }
        }

        if (model.getTermId() != null) {
            TermInfo termInfo = termInfoMapper.selectByPrimaryKey(model.getTermId()); //学期为外接字段,需要关联学期来解释该字段

            if (termInfo != null) {
                map.put("termIdStr", termInfo.getTname());
            }
        }

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        studentInfoMapper.deleteByPrimaryKey(id);
    }
}

