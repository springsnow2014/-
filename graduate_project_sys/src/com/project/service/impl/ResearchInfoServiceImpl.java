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
public class ResearchInfoServiceImpl implements ResearchInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    ResearchInfoMapper researchInfoMapper;
    @Autowired
    CollegeInfoMapper collegeInfoMapper;

    /**
      新增
    */
    @Override
    public String add(ResearchInfo model, LoginModel login) {
        if ((model.getRname() == null) || model.getRname().equals("")) {
            return "类型名为必填属性";
        }

        if (model.getCid() == null) {
            return "学院ID为必填属性";
        }

        researchInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update(ResearchInfo model, LoginModel login) {
        ResearchInfo preModel = researchInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getRname() == null) || model.getRname().equals("")) {
            return "类型名为必填属性";
        }

        if (model.getCid() == null) {
            return "学院ID为必填属性";
        }

        preModel.setRname(model.getRname());
        preModel.setCid(model.getCid());
        researchInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询研究方向列表数据
    */
    @Override
    public Map<String, Object> getDataList(ResearchInfo queryModel,
        Integer page, Integer pageSize, LoginModel login) {
        ResearchInfoExample se = new ResearchInfoExample();
        ResearchInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if ((queryModel.getRname() != null) &&
                (queryModel.getRname().equals("") == false)) {
            sc.andRnameLike("%" + queryModel.getRname() + "%"); //模糊查询
        }

        int count = (int) researchInfoMapper.countByExample(se);
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

        List<ResearchInfo> list = researchInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (ResearchInfo model : list) {
            list2.add(getResearchInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装研究方向为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getResearchInfoModel(ResearchInfo model,
        LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("researchInfo", model);

        if (model.getCid() != null) {
            CollegeInfo collegeInfo = collegeInfoMapper.selectByPrimaryKey(model.getCid()); //学院ID为外接字段,需要关联学院来解释该字段

            if (collegeInfo != null) {
                map.put("cidStr", collegeInfo.getCname());
            }
        }

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        researchInfoMapper.deleteByPrimaryKey(id);
    }
}

