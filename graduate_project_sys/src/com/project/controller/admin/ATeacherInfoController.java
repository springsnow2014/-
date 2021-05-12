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
@RequestMapping("/admin/teacher_info")
public class ATeacherInfoController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    TeacherInfoService teacherInfoService;
    @Autowired
    AdminInfoMapper adminInfoMapper;
    @Autowired
    CollegeInfoMapper collegeInfoMapper;
    @Autowired
    TeacherInfoMapper teacherInfoMapper;
    @Autowired
    ResearchInfoMapper researchInfoMapper;

    public void getList(ModelMap modelMap, LoginModel login) {
        modelMap.addAttribute("sexList", DataListUtils.getSexList()); //返回sex列表
        modelMap.addAttribute("isSelectList", DataListUtils.getIsSelectList()); //返回is_select列表

        CollegeInfoExample collegeInfoE = new CollegeInfoExample();
        CollegeInfoExample.Criteria collegeInfoC = collegeInfoE.createCriteria();
        List<CollegeInfo> collegeInfoList = collegeInfoMapper.selectByExample(collegeInfoE);
        List<Map<String, Object>> collegeInfoList2 = new ArrayList<Map<String, Object>>();

        for (CollegeInfo m : collegeInfoList) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", m.getId());
            map.put("name", m.getCname());
            collegeInfoList2.add(map);
        }

        modelMap.addAttribute("collegeInfoList", collegeInfoList2);

        ResearchInfoExample researchInfoE = new ResearchInfoExample();
        ResearchInfoExample.Criteria researchInfoC = researchInfoE.createCriteria();
        List<ResearchInfo> researchInfoList = researchInfoMapper.selectByExample(researchInfoE);
        List<Map<String, Object>> researchInfoList2 = new ArrayList<Map<String, Object>>();

        for (ResearchInfo m : researchInfoList) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", m.getId());
            map.put("name", m.getRname());
            researchInfoList2.add(map);
        }

        modelMap.addAttribute("researchInfoList", researchInfoList2);
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
     * 返回导师列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        AdminInfo adminInfo = adminInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", adminInfo);
        getList(modelMap, login); //获取数据列表并返回给前台

        return "admin/teacher_info/list";
    }

    /**
     * 根据查询条件分页查询导师数据,然后返回给前台渲染
    */
    @RequestMapping(value = "queryList")
    @ResponseBody
    public Object toList(TeacherInfo model, Integer page,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        return teacherInfoService.getDataList(model, page, CommonVal.pageSize,
            login); //分页查询数据
    }

    /**
     进入新增页面
    */
    @RequestMapping("add")
    public String add(ModelMap modelMap, TeacherInfo model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        getList(modelMap, login); //获取前台需要用到的数据列表并返回给前台
        modelMap.addAttribute("data", model);

        return "admin/teacher_info/add_page";
    }

    /**
     新增提交信息接口
    */
    @RequestMapping("add_submit")
    @ResponseBody
    public Object add_submit(TeacherInfo model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = teacherInfoService.add(model, login); //执行添加操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "新增成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }

    /**
     进入修改页面
    */
    @RequestMapping("update")
    public String update(ModelMap modelMap, TeacherInfo model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        getList(modelMap, login); //获取前台需要用到的数据列表并返回给前台

        TeacherInfo data = teacherInfoMapper.selectByPrimaryKey(model.getId());
        modelMap.addAttribute("data", data);

        return "admin/teacher_info/update_page";
    }

    /**
     修改提交信息接口
    */
    @RequestMapping("update_submit")
    @ResponseBody
    public Object update_submit(TeacherInfo model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = teacherInfoService.update(model, login); //执行修改操作

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

    /**
     删除导师接口
    */
    @RequestMapping("del")
    @ResponseBody
    public Object del(Integer id, ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        teacherInfoService.delete(id);
        rs.put("code", 1);
        rs.put("msg",
            "删除成功");

        return rs;
    }
}

