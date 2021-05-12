package com.project.dao;

import com.project.model.CollegeInfo;
import com.project.model.CollegeInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CollegeInfoMapper {
    long countByExample(CollegeInfoExample example);

    int deleteByExample(CollegeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CollegeInfo record);

    int insertSelective(CollegeInfo record);

    List<CollegeInfo> selectByExample(CollegeInfoExample example);

    CollegeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    CollegeInfo record, @Param("example")
    CollegeInfoExample example);

    int updateByExample(@Param("record")
    CollegeInfo record, @Param("example")
    CollegeInfoExample example);

    int updateByPrimaryKeySelective(CollegeInfo record);

    int updateByPrimaryKey(CollegeInfo record);
}

