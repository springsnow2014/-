package com.project.dao;

import com.project.model.GradeInfo;
import com.project.model.GradeInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface GradeInfoMapper {
    long countByExample(GradeInfoExample example);

    int deleteByExample(GradeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GradeInfo record);

    int insertSelective(GradeInfo record);

    List<GradeInfo> selectByExample(GradeInfoExample example);

    GradeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    GradeInfo record, @Param("example")
    GradeInfoExample example);

    int updateByExample(@Param("record")
    GradeInfo record, @Param("example")
    GradeInfoExample example);

    int updateByPrimaryKeySelective(GradeInfo record);

    int updateByPrimaryKey(GradeInfo record);
}

