package com.project.service;

import com.project.controller.LoginModel;

import com.project.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface CollegeInfoService {
    /**
      分页查询学院数据列表
    */
    public Map<String, Object> getDataList(CollegeInfo queryModel,
        Integer page, Integer pageSize, LoginModel login);

    /**
      封装学院为前台展示的数据形式
    */
    public Map<String, Object> getCollegeInfoModel(CollegeInfo model,
        LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(CollegeInfo model, LoginModel login);

    /**
      修改
    */
    public String update(CollegeInfo model, LoginModel login);
}

