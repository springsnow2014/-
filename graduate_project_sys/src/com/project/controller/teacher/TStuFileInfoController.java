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
@RequestMapping("/teacher/stu_file_info")
public class TStuFileInfoController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    StuFileInfoService stuFileInfoService;
    @Autowired
    StuApplyLogMapper stuApplyLogMapper;
    @Autowired
    StuFileInfoMapper stuFileInfoMapper;
    @Autowired
    TeacherInfoMapper teacherInfoMapper;

    /**
    * 返回项目文档列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, Integer projectId,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        TeacherInfo teacherInfo = teacherInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", teacherInfo);

        StuFileInfo model = new StuFileInfo();
        model.setProjectId(projectId);
        modelMap.addAttribute("data", model);

        return "teacher/stu_file_info/list";
    }

    /**
     * 根据查询条件分页查询项目文档数据,然后返回给前台渲染
    */
    @RequestMapping(value = "queryList")
    @ResponseBody
    public Object toList(StuFileInfo model, Integer page,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        return stuFileInfoService.getDataList(model, page, CommonVal.pageSize,
            login); //分页查询数据
    }

    /**
     删除项目文档接口
    */
    @RequestMapping("del")
    @ResponseBody
    public Object del(Integer id, ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        stuFileInfoService.delete(id);
        rs.put("code", 1);
        rs.put("msg",
            "删除成功");

        return rs;
    }

    /**
     进入评阅页面
    */
    @RequestMapping("eval")
    public String eval(ModelMap modelMap, StuFileInfo model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        StuFileInfo data = stuFileInfoMapper.selectByPrimaryKey(model.getId());
        modelMap.addAttribute("data", data);

        return "teacher/stu_file_info/eval_page";
    }

    /**
     评阅提交信息接口
    */
    @RequestMapping("eval_submit")
    @ResponseBody
    public Object eval_submit(StuFileInfo model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = stuFileInfoService.eval(model, login); //执行修改操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "评阅成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }
}

