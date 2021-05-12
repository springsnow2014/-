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
@RequestMapping("/student/teacher_eval")
public class STeacherEvalController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    TeacherEvalService teacherEvalService;
    @Autowired
    StudentInfoMapper studentInfoMapper;
    @Autowired
    StuApplyLogMapper stuApplyLogMapper;
    @Autowired
    TeacherEvalMapper teacherEvalMapper;

    /**
    * 返回学业评分列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, Integer projectId,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", studentInfo);

        TeacherEval model = new TeacherEval();
        model.setProjectId(projectId);
        modelMap.addAttribute("data", model);

        return "student/teacher_eval/list";
    }

    /**
     * 根据查询条件分页查询学业评分数据,然后返回给前台渲染
    */
    @RequestMapping(value = "queryList")
    @ResponseBody
    public Object toList(TeacherEval model, Integer page,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        return teacherEvalService.getDataList(model, page, CommonVal.pageSize,
            login); //分页查询数据
    }
}

