package com.project.service;

import com.project.controller.LoginModel;

import com.project.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface StuApplyLogService {
    /**
      分页查询学生项目申请数据列表
    */
    public Map<String, Object> getDataList(StuApplyLog queryModel,
        Integer page, Integer pageSize, LoginModel login);

    /**
      封装学生项目申请为前台展示的数据形式
    */
    public Map<String, Object> getStuApplyLogModel(StuApplyLog model,
        LoginModel login);

    /**
      选择导师
    */
    public String selectTurtor(StuApplyLog model, LoginModel login);

    /**
      取消
    */
    public String qx(StuApplyLog model, LoginModel login);

    /**
      同意申请
    */
    public String ty(StuApplyLog model, LoginModel login);

    /**
      拒绝申请
    */
    public String jj(StuApplyLog model, LoginModel login);
}

