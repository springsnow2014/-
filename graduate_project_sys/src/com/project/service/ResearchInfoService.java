package com.project.service;

import com.project.controller.LoginModel;

import com.project.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface ResearchInfoService {
    /**
      分页查询研究方向数据列表
    */
    public Map<String, Object> getDataList(ResearchInfo queryModel,
        Integer page, Integer pageSize, LoginModel login);

    /**
      封装研究方向为前台展示的数据形式
    */
    public Map<String, Object> getResearchInfoModel(ResearchInfo model,
        LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(ResearchInfo model, LoginModel login);

    /**
      修改
    */
    public String update(ResearchInfo model, LoginModel login);
}

