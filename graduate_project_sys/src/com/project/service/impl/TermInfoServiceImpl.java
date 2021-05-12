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
public class TermInfoServiceImpl implements TermInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    TermInfoMapper termInfoMapper;
    @Autowired
    GradeInfoMapper gradeInfoMapper;

    /**
      新增
    */
    @Override
    public String add(TermInfo model, LoginModel login) {
        if ((model.getTname() == null) || model.getTname().equals("")) {
            return "学期名为必填属性";
        }

        if (model.getGid() == null) {
            return "年级ID为必填属性";
        }

        termInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update(TermInfo model, LoginModel login) {
        TermInfo preModel = termInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getTname() == null) || model.getTname().equals("")) {
            return "学期名为必填属性";
        }

        if (model.getGid() == null) {
            return "年级ID为必填属性";
        }

        preModel.setTname(model.getTname());
        preModel.setGid(model.getGid());
        termInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询学期列表数据
    */
    @Override
    public Map<String, Object> getDataList(TermInfo queryModel, Integer page,
        Integer pageSize, LoginModel login) {
        TermInfoExample se = new TermInfoExample();
        TermInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if ((queryModel.getTname() != null) &&
                (queryModel.getTname().equals("") == false)) {
            sc.andTnameLike("%" + queryModel.getTname() + "%"); //模糊查询
        }

        int count = (int) termInfoMapper.countByExample(se);
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

        List<TermInfo> list = termInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (TermInfo model : list) {
            list2.add(getTermInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装学期为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getTermInfoModel(TermInfo model, LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("termInfo", model);

        if (model.getGid() != null) {
            GradeInfo gradeInfo = gradeInfoMapper.selectByPrimaryKey(model.getGid()); //年级ID为外接字段,需要关联年级来解释该字段

            if (gradeInfo != null) {
                map.put("gidStr", gradeInfo.getGname());
            }
        }

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        termInfoMapper.deleteByPrimaryKey(id);
    }
}

