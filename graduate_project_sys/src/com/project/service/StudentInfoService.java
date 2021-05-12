package com.project.service;

import com.project.controller.LoginModel;

import com.project.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface StudentInfoService {
    /**
      分页查询学生数据列表
    */
    public Map<String, Object> getDataList(StudentInfo queryModel,
        Integer page, Integer pageSize, LoginModel login);

    /**
      封装学生为前台展示的数据形式
    */
    public Map<String, Object> getStudentInfoModel(StudentInfo model,
        LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(StudentInfo model, LoginModel login);

    /**
      修改
    */
    public String update(StudentInfo model, LoginModel login);

    /**
      修改
    */
    public String update2(StudentInfo model, LoginModel login);
}

