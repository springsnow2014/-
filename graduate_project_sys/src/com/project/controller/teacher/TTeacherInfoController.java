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
@RequestMapping("/teacher/teacher_info")
public class TTeacherInfoController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    TeacherInfoService teacherInfoService;
    @Autowired
    CollegeInfoMapper collegeInfoMapper;
    @Autowired
    TeacherInfoMapper teacherInfoMapper;
    @Autowired
    ResearchInfoMapper researchInfoMapper;

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
     进入导师详情页
    */
    @RequestMapping("detail")
    public Object detail(ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        TeacherInfo model = new TeacherInfo();
        model.setId(login.getId());

        TeacherInfo preModel = teacherInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("detail",
            teacherInfoService.getTeacherInfoModel(preModel, login));

        return "teacher/personal";
    }

    /**
     进入修改页面
    */
    @RequestMapping("update2")
    public String update2(ModelMap modelMap, TeacherInfo model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        TeacherInfo data = teacherInfoMapper.selectByPrimaryKey(model.getId());
        modelMap.addAttribute("data", data);

        return "teacher/teacher_info/update2_page";
    }

    /**
     修改提交信息接口
    */
    @RequestMapping("update2_submit")
    @ResponseBody
    public Object update2_submit(TeacherInfo model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = teacherInfoService.update2(model, login); //执行修改操作

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

