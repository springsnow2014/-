package com.project.service;

import com.project.controller.LoginModel;

import com.project.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface ChatChatService {
    /**
              查询最新未读消息
    */
    public int getTotalNewChatLog(LoginModel login);
}

