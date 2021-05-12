package com.project.service.impl;

import com.project.controller.LoginModel;

import com.project.dao.*;

import com.project.model.*;

import com.project.service.*;

import com.project.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.ui.ModelMap;

import java.io.IOException;
import java.io.InputStream;

import java.text.SimpleDateFormat;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Service
public class ChatLogServiceImpl implements ChatLogService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    ChatLogMapper chatLogMapper;
    @Autowired
    TeacherInfoMapper teacherInfoMapper;
    @Autowired
    StudentInfoMapper studentInfoMapper;

    /**
    *根据参数查询聊天记录列表数据
    */
    @Override
    public Map<String, Object> getDataList(ChatLog queryModel, Integer page,
        Integer pageSize, LoginModel login) {
        ChatLogExample se = new ChatLogExample();
        ChatLogExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if ((queryModel.getContent() != null) &&
                (queryModel.getContent().equals("") == false)) {
            sc.andContentLike("%" + queryModel.getContent() + "%"); //模糊查询
        }

        int count = (int) chatLogMapper.countByExample(se);
        int totalPage = 0;

        if ((page != null) && (pageSize != null)) { //分页

            if ((count > 0) && ((count % pageSize) == 0)) {
                totalPage = count / pageSize;
            } else {
                totalPage = (count / pageSize) + 1;
            }

            se.setPageRows(pageSize);
            se.setStartRow((page - 1) * pageSize);
        }

        List<ChatLog> list = chatLogMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (ChatLog model : list) {
            list2.add(getChatLogModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装聊天记录为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getChatLogModel(ChatLog model, LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("chatLog", model);

        if (model.getTid() != null) {
            TeacherInfo teacherInfo = teacherInfoMapper.selectByPrimaryKey(model.getTid()); //导师ID为外接字段,需要关联导师来解释该字段

            if (teacherInfo != null) {
                map.put("tidStr", teacherInfo.getTno());
            }
        }

        if (model.getSid() != null) {
            StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(model.getSid()); //学生ID为外接字段,需要关联学生来解释该字段

            if (studentInfo != null) {
                map.put("sidStr", studentInfo.getStuNo());
            }
        }

        return map;
    }
}

