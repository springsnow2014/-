package com.project.controller.student;

import com.project.controller.LoginModel;

import com.project.dao.*;

import com.project.model.*;

import com.project.service.*;
import com.project.service.impl.*;

import com.project.util.*;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/student/student_info")
public class SStudentInfoController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    StudentInfoService studentInfoService;
    @Autowired
    StudentInfoMapper studentInfoMapper;
    @Autowired
    CollegeInfoMapper collegeInfoMapper;
    @Autowired
    ClassInfoMapper classInfoMapper;
    @Autowired
    GradeInfoMapper gradeInfoMapper;
    @Autowired
    TermInfoMapper termInfoMapper;
    @Autowired
    ResearchInfoMapper researchInfoMapper;

    /**
    * 根据学院ID查询班级列表
    */
    @RequestMapping(value = "getClassInfoListByCid")
    @ResponseBody
    public Object getClassInfoListByCid(Integer cid) {
        List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();

        if (cid == null) {
            return rs;
        }

        ClassInfoExample te = new ClassInfoExample();
        ClassInfoExample.Criteria tc = te.createCriteria();
        tc.andCidEqualTo(cid);

        List<ClassInfo> tl = classInfoMapper.selectByExample(te);

        for (ClassInfo t : tl) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", t.getId());
            map.put("name", t.getClassName());
            rs.add(map);
        }

        return rs;
    }

    /**
     * 根据学院ID查询研究方向列表
    */
    @RequestMapping(value = "getResearchInfoListByCid")
    @ResponseBody
    public Object getResearchInfoListByCid(Integer cid) {
        List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();

        if (cid == null) {
            return rs;
        }

        ResearchInfoExample te = new ResearchInfoExample();
        ResearchInfoExample.Criteria tc = te.createCriteria();
        tc.andCidEqualTo(cid);

        List<ResearchInfo> tl = researchInfoMapper.selectByExample(te);

        for (ResearchInfo t : tl) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", t.getId());
            map.put("name", t.getRname());
            rs.add(map);
        }

        return rs;
    }

    /**
     * 根据年级ID查询学期列表
    */
    @RequestMapping(value = "getTermInfoListByGid")
    @ResponseBody
    public Object getTermInfoListByGid(Integer gid) {
        List<Map<String, Object>> rs = new ArrayList<Map<String, Object>>();

        if (gid == null) {
            return rs;
        }

        TermInfoExample te = new TermInfoExample();
        TermInfoExample.Criteria tc = te.createCriteria();
        tc.andGidEqualTo(gid);

        List<TermInfo> tl = termInfoMapper.selectByExample(te);

        for (TermInfo t : tl) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", t.getId());
            map.put("name", t.getTname());
            rs.add(map);
        }

        return rs;
    }

    /**
     进入学生详情页
    */
    @RequestMapping("detail")
    public Object detail(ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        StudentInfo model = new StudentInfo();
        model.setId(login.getId());

        StudentInfo preModel = studentInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("detail",
            studentInfoService.getStudentInfoModel(preModel, login));

        return "student/personal";
    }

    /**
     进入修改页面
    */
    @RequestMapping("update2")
    public String update2(ModelMap modelMap, StudentInfo model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        StudentInfo data = studentInfoMapper.selectByPrimaryKey(model.getId());
        modelMap.addAttribute("data", data);

        return "student/student_info/update2_page";
    }

    /**
     修改提交信息接口
    */
    @RequestMapping("update2_submit")
    @ResponseBody
    public Object update2_submit(StudentInfo model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = studentInfoService.update2(model, login); //执行修改操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "修改成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }
}

