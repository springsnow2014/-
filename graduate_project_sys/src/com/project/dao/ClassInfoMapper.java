package com.project.dao;

import com.project.model.ClassInfo;
import com.project.model.ClassInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ClassInfoMapper {
    long countByExample(ClassInfoExample example);

    int deleteByExample(ClassInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassInfo record);

    int insertSelective(ClassInfo record);

    List<ClassInfo> selectByExample(ClassInfoExample example);

    ClassInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    ClassInfo record, @Param("example")
    ClassInfoExample example);

    int updateByExample(@Param("record")
    ClassInfo record, @Param("example")
    ClassInfoExample example);

    int updateByPrimaryKeySelective(ClassInfo record);

    int updateByPrimaryKey(ClassInfo record);
}

