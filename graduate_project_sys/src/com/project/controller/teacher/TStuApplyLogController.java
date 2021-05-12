package com.project.controller.teacher;

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
@RequestMapping("/teacher/stu_apply_log")
public class TStuApplyLogController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    StuApplyLogService stuApplyLogService;
    @Autowired
    StuApplyLogMapper stuApplyLogMapper;
    @Autowired
    TeacherInfoMapper teacherInfoMapper;

    /**
    * 返回学生项目申请列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, Integer selectStatus,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        TeacherInfo teacherInfo = teacherInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", teacherInfo);

        StuApplyLog model = new StuApplyLog();
        model.setSelectStatus(selectStatus);
        modelMap.addAttribute("data", model);

        return "teacher/stu_apply_log/list";
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
        model.setTeacherId(login.getId()); //导师ID等于当前登录id

        return stuApplyLogService.getDataList(model, page, CommonVal.pageSize,
            login); //分页查询数据
    }

    /**
     进入同意申请页面
    */
    @RequestMapping("ty")
    public String ty(ModelMap modelMap, StuApplyLog model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        StuApplyLog data = stuApplyLogMapper.selectByPrimaryKey(model.getId());
        modelMap.addAttribute("data", data);

        return "teacher/stu_apply_log/ty_page";
    }

    /**
     同意申请提交信息接口
    */
    @RequestMapping("ty_submit")
    @ResponseBody
    public Object ty_submit(StuApplyLog model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = stuApplyLogService.ty(model, login); //执行修改操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "同意申请成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }

    /**
     进入拒绝申请页面
    */
    @RequestMapping("jj")
    public String jj(ModelMap modelMap, StuApplyLog model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        StuApplyLog data = stuApplyLogMapper.selectByPrimaryKey(model.getId());
        modelMap.addAttribute("data", data);

        return "teacher/stu_apply_log/jj_page";
    }

    /**
     拒绝申请提交信息接口
    */
    @RequestMapping("jj_submit")
    @ResponseBody
    public Object jj_submit(StuApplyLog model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = stuApplyLogService.jj(model, login); //执行修改操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "拒绝申请成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }
}

