package com.project.service.impl;

import com.project.controller.*;

import com.project.dao.*;

import com.project.model.*;

import com.project.service.*;

import com.project.util.*;
import com.project.util.PageUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Service
public class ChatChatServiceImpl implements ChatChatService {
    @Autowired
    ChatLogMapper chatLogMapper;
    @Autowired
    TeacherInfoMapper teacherInfoMapper;
    @Autowired
    StudentInfoMapper studentInfoMapper;

    @Override
    public int getTotalNewChatLog(LoginModel login) {
        int totalNum = 0;

        if (login == null) {
            return totalNum;
        }

        if (login.getLoginType() == 2) {
            ChatLogExample ce3 = new ChatLogExample();
            ChatLogExample.Criteria cc3 = ce3.createCriteria();
            cc3.andTidEqualTo(login.getId());
            cc3.andIsReadEqualTo(2); //未读
            cc3.andTypeEqualTo(2); //别人发给我的信息
            totalNum += (int) chatLogMapper.countByExample(ce3);
        }

        if (login.getLoginType() == 3) {
            ChatLogExample ce3 = new ChatLogExample();
            ChatLogExample.Criteria cc3 = ce3.createCriteria();
            cc3.andSidEqualTo(login.getId());
            cc3.andIsReadEqualTo(2); //未读
            cc3.andTypeEqualTo(1); //别人发给我的信息
            totalNum += (int) chatLogMapper.countByExample(ce3);
        }

        return totalNum;
    }
}

