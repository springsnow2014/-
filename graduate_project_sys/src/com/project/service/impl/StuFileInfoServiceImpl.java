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
public class StuFileInfoServiceImpl implements StuFileInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    StuFileInfoMapper stuFileInfoMapper;
    @Autowired
    StuApplyLogMapper stuApplyLogMapper;

    /**
      新增
    */
    @Override
    public String add(StuFileInfo model, LoginModel login) {
        if ((model.getTitle() == null) || model.getTitle().equals("")) {
            return "标题为必填属性";
        }

        if ((model.getFileIntro() == null) || model.getFileIntro().equals("")) {
            return "简介为必填属性";
        }

        if ((model.getFileUrl() == null) || model.getFileUrl().equals("")) {
            return "文件为必填属性";
        }

        if (model.getFileUrl() != null) {
            String[] fileSplit = model.getFileUrl().split(";");

            if (fileSplit.length > 1) {
                return "文件的文件数量不能大于1";
            }
        }

        model.setCreateTime(sdf1.format(new Date())); //当前时间格式
        stuFileInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update(StuFileInfo model, LoginModel login) {
        StuFileInfo preModel = stuFileInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getTitle() == null) || model.getTitle().equals("")) {
            return "标题为必填属性";
        }

        if ((model.getFileIntro() == null) || model.getFileIntro().equals("")) {
            return "简介为必填属性";
        }

        if ((model.getFileUrl() == null) || model.getFileUrl().equals("")) {
            return "文件为必填属性";
        }

        if (model.getFileUrl() != null) {
            String[] fileSplit = model.getFileUrl().split(";");

            if (fileSplit.length > 1) {
                return "文件的文件数量不能大于1";
            }
        }

        preModel.setTitle(model.getTitle());
        preModel.setFileIntro(model.getFileIntro());
        preModel.setFileUrl(model.getFileUrl());
        stuFileInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
      评阅
    */
    @Override
    public String eval(StuFileInfo model, LoginModel login) {
        StuFileInfo preModel = stuFileInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getTeacherEval() == null) ||
                model.getTeacherEval().equals("")) {
            return "导师评语为必填属性";
        }

        preModel.setTeacherEval(model.getTeacherEval());
        stuFileInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询项目文档列表数据
    */
    @Override
    public Map<String, Object> getDataList(StuFileInfo queryModel,
        Integer page, Integer pageSize, LoginModel login) {
        StuFileInfoExample se = new StuFileInfoExample();
        StuFileInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getProjectId() != null) {
            sc.andProjectIdEqualTo(queryModel.getProjectId());
        }

        if ((queryModel.getTitle() != null) &&
                (queryModel.getTitle().equals("") == false)) {
            sc.andTitleLike("%" + queryModel.getTitle() + "%"); //模糊查询
        }

        int count = (int) stuFileInfoMapper.countByExample(se);
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

        List<StuFileInfo> list = stuFileInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (StuFileInfo model : list) {
            list2.add(getStuFileInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装项目文档为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getStuFileInfoModel(StuFileInfo model,
        LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("stuFileInfo", model);

        if (model.getProjectId() != null) {
            StuApplyLog stuApplyLog = stuApplyLogMapper.selectByPrimaryKey(model.getProjectId()); //项目为外接字段,需要关联学生项目申请来解释该字段

            if (stuApplyLog != null) {
                map.put("projectIdStr", stuApplyLog.getProjectTitle());
            }
        }

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        stuFileInfoMapper.deleteByPrimaryKey(id);
    }
}

