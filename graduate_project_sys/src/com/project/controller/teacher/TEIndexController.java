package com.project.controller.teacher;

import com.project.controller.LoginModel;

import com.project.dao.*;

import com.project.model.*;

import com.project.service.*;

import com.project.util.CommonVal;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/teacher/index")
public class TEIndexController {
    @Autowired
    TeacherInfoMapper teacherInfoMapper;
    @Autowired
    ChatChatService chatChatService;

    /**
      导师角色进入管理首页接口
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        TeacherInfo user = teacherInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", user);

        int chatNewMsgNum = chatChatService.getTotalNewChatLog(login);
        modelMap.addAttribute("chatNewMsgNum", chatNewMsgNum);

        modelMap.addAttribute("roleName", "导师");
        modelMap.addAttribute("login", login);

        return "teacher/index";
    }
}

