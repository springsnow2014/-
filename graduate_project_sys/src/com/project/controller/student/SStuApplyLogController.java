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
@RequestMapping("/student/stu_apply_log")
public class SStuApplyLogController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    StuApplyLogService stuApplyLogService;
    @Autowired
    StudentInfoMapper studentInfoMapper;
    @Autowired
    StuApplyLogMapper stuApplyLogMapper;
    @Autowired
    TeacherInfoMapper teacherInfoMapper;

    /**
    * 返回学生项目申请列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, Integer teacherId,
        Integer selectStatus, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", studentInfo);

        StuApplyLog model = new StuApplyLog();
        model.setTeacherId(teacherId);
        model.setSelectStatus(selectStatus);
        modelMap.addAttribute("data", model);

        return "student/stu_apply_log/list";
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
        model.setStuId(login.getId()); //学生ID等于当前登录id

        return stuApplyLogService.getDataList(model, page, CommonVal.pageSize,
            login); //分页查询数据
    }

    /**
     进入选择导师页面
    */
    @RequestMapping("select_turtor")
    public String select_turtor(ModelMap modelMap, StuApplyLog model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        modelMap.addAttribute("data", model);

        return "student/stu_apply_log/select_turtor_page";
    }

    /**
     选择导师提交信息接口
    */
    @RequestMapping("select_turtor_submit")
    @ResponseBody
    public Object select_turtor_submit(StuApplyLog model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = stuApplyLogService.selectTurtor(model, login); //执行添加操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "选择导师成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }

    /**
     进入取消页面
    */
    @RequestMapping("qx")
    public String qx(ModelMap modelMap, StuApplyLog model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        StuApplyLog data = stuApplyLogMapper.selectByPrimaryKey(model.getId());
        modelMap.addAttribute("data", data);

        return "student/stu_apply_log/qx_page";
    }

    /**
     取消提交信息接口
    */
    @RequestMapping("qx_submit")
    @ResponseBody
    public Object qx_submit(StuApplyLog model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = stuApplyLogService.qx(model, login); //执行修改操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "取消成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }
}

