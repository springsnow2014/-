package com.project.controller.admin;

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
@RequestMapping("/admin/stu_apply_log")
public class AStuApplyLogController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    StuApplyLogService stuApplyLogService;
    @Autowired
    StudentInfoMapper studentInfoMapper;
    @Autowired
    StuApplyLogMapper stuApplyLogMapper;
    @Autowired
    AdminInfoMapper adminInfoMapper;
    @Autowired
    TeacherInfoMapper teacherInfoMapper;

    public void getList(ModelMap modelMap, LoginModel login) {
        TeacherInfoExample teacherInfoE = new TeacherInfoExample();
        TeacherInfoExample.Criteria teacherInfoC = teacherInfoE.createCriteria();
        List<TeacherInfo> teacherInfoList = teacherInfoMapper.selectByExample(teacherInfoE);
        List<Map<String, Object>> teacherInfoList2 = new ArrayList<Map<String, Object>>();

        for (TeacherInfo m : teacherInfoList) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", m.getId());
            map.put("name", m.getTno() + "," + m.getRealName());
            teacherInfoList2.add(map);
        }

        modelMap.addAttribute("teacherInfoList", teacherInfoList2);

        StudentInfoExample studentInfoE = new StudentInfoExample();
        StudentInfoExample.Criteria studentInfoC = studentInfoE.createCriteria();
        List<StudentInfo> studentInfoList = studentInfoMapper.selectByExample(studentInfoE);
        List<Map<String, Object>> studentInfoList2 = new ArrayList<Map<String, Object>>();

        for (StudentInfo m : studentInfoList) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", m.getId());
            map.put("name", m.getStuNo() + "," + m.getRealName());
            studentInfoList2.add(map);
        }

        modelMap.addAttribute("studentInfoList", studentInfoList2);
    }

    /**
     * 返回学生项目申请列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, Integer selectStatus,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        AdminInfo adminInfo = adminInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", adminInfo);

        StuApplyLog model = new StuApplyLog();
        model.setSelectStatus(selectStatus);
        modelMap.addAttribute("data", model);
        getList(modelMap, login); //获取数据列表并返回给前台

        return "admin/stu_apply_log/list";
    }

    /**
     * 根据查询条件分页查询学生项目申请数据,然后返回给前台渲染
    */
    @RequestMapping(value = "queryList")
    @ResponseBody
    public Object toList(StuApplyLog model, Integer page,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        return stuApplyLogService.getDataList(model, page, CommonVal.pageSize,
            login); //分页查询数据
    }
}

