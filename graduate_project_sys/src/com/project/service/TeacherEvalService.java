package com.project.service;

import com.project.controller.LoginModel;

import com.project.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface TeacherEvalService {
    /**
      分页查询学业评分数据列表
    */
    public Map<String, Object> getDataList(TeacherEval queryModel,
        Integer page, Integer pageSize, LoginModel login);

    /**
      封装学业评分为前台展示的数据形式
    */
    public Map<String, Object> getTeacherEvalModel(TeacherEval model,
        LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(TeacherEval model, LoginModel login);

    /**
      修改
    */
    public String update(TeacherEval model, LoginModel login);
}

