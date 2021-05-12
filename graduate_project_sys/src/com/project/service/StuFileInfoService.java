package com.project.service;

import com.project.controller.LoginModel;

import com.project.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface StuFileInfoService {
    /**
      分页查询项目文档数据列表
    */
    public Map<String, Object> getDataList(StuFileInfo queryModel,
        Integer page, Integer pageSize, LoginModel login);

    /**
      封装项目文档为前台展示的数据形式
    */
    public Map<String, Object> getStuFileInfoModel(StuFileInfo model,
        LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(StuFileInfo model, LoginModel login);

    /**
      修改
    */
    public String update(StuFileInfo model, LoginModel login);

    /**
      评阅
    */
    public String eval(StuFileInfo model, LoginModel login);
}

