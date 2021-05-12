package com.project.controller.student;

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
@RequestMapping("/student/index")
public class STIndexController {
    @Autowired
    StudentInfoMapper studentInfoMapper;
    @Autowired
    ChatChatService chatChatService;

    /**
      学生角色进入管理首页接口
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        StudentInfo user = studentInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", user);

        int chatNewMsgNum = chatChatService.getTotalNewChatLog(login);
        modelMap.addAttribute("chatNewMsgNum", chatNewMsgNum);

        modelMap.addAttribute("roleName", "学生");
        modelMap.addAttribute("login", login);

        return "student/index";
    }
}

