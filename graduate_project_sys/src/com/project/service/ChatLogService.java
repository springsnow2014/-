package com.project.service;

import com.project.controller.LoginModel;

import com.project.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface ChatLogService {
    /**
      分页查询聊天记录数据列表
    */
    public Map<String, Object> getDataList(ChatLog queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装聊天记录为前台展示的数据形式
    */
    public Map<String, Object> getChatLogModel(ChatLog model, LoginModel login);
}

