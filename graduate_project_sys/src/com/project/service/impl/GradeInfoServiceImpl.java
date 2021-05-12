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
public class GradeInfoServiceImpl implements GradeInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    GradeInfoMapper gradeInfoMapper;

    /**
      新增
    */
    @Override
    public String add(GradeInfo model, LoginModel login) {
        if ((model.getGname() == null) || model.getGname().equals("")) {
            return "年级名为必填属性";
        }

        gradeInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update(GradeInfo model, LoginModel login) {
        GradeInfo preModel = gradeInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getGname() == null) || model.getGname().equals("")) {
            return "年级名为必填属性";
        }

        preModel.setGname(model.getGname());
        gradeInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询年级列表数据
    */
    @Override
    public Map<String, Object> getDataList(GradeInfo queryModel, Integer page,
        Integer pageSize, LoginModel login) {
        GradeInfoExample se = new GradeInfoExample();
        GradeInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if ((queryModel.getGname() != null) &&
                (queryModel.getGname().equals("") == false)) {
            sc.andGnameLike("%" + queryModel.getGname() + "%"); //模糊查询
        }

        int count = (int) gradeInfoMapper.countByExample(se);
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

        List<GradeInfo> list = gradeInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (GradeInfo model : list) {
            list2.add(getGradeInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装年级为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getGradeInfoModel(GradeInfo model,
        LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("gradeInfo", model);

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        gradeInfoMapper.deleteByPrimaryKey(id);
    }
}

