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
public class CollegeInfoServiceImpl implements CollegeInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    CollegeInfoMapper collegeInfoMapper;

    /**
      新增
    */
    @Override
    public String add(CollegeInfo model, LoginModel login) {
        if ((model.getCname() == null) || model.getCname().equals("")) {
            return "学院名为必填属性";
        }

        if ((model.getAddress() == null) || model.getAddress().equals("")) {
            return "学院地址为必填属性";
        }

        if ((model.getContactTel() == null) ||
                model.getContactTel().equals("")) {
            return "联系电话为必填属性";
        }

        collegeInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update(CollegeInfo model, LoginModel login) {
        CollegeInfo preModel = collegeInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getCname() == null) || model.getCname().equals("")) {
            return "学院名为必填属性";
        }

        if ((model.getAddress() == null) || model.getAddress().equals("")) {
            return "学院地址为必填属性";
        }

        if ((model.getContactTel() == null) ||
                model.getContactTel().equals("")) {
            return "联系电话为必填属性";
        }

        preModel.setCname(model.getCname());
        preModel.setAddress(model.getAddress());
        preModel.setContactTel(model.getContactTel());
        collegeInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询学院列表数据
    */
    @Override
    public Map<String, Object> getDataList(CollegeInfo queryModel,
        Integer page, Integer pageSize, LoginModel login) {
        CollegeInfoExample se = new CollegeInfoExample();
        CollegeInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if ((queryModel.getCname() != null) &&
                (queryModel.getCname().equals("") == false)) {
            sc.andCnameLike("%" + queryModel.getCname() + "%"); //模糊查询
        }

        int count = (int) collegeInfoMapper.countByExample(se);
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

        List<CollegeInfo> list = collegeInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (CollegeInfo model : list) {
            list2.add(getCollegeInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装学院为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getCollegeInfoModel(CollegeInfo model,
        LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("collegeInfo", model);

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        collegeInfoMapper.deleteByPrimaryKey(id);
    }
}

