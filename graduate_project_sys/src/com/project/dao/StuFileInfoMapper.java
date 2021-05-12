package com.project.dao;

import com.project.model.StuFileInfo;
import com.project.model.StuFileInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StuFileInfoMapper {
    long countByExample(StuFileInfoExample example);

    int deleteByExample(StuFileInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StuFileInfo record);

    int insertSelective(StuFileInfo record);

    List<StuFileInfo> selectByExample(StuFileInfoExample example);

    StuFileInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    StuFileInfo record, @Param("example")
    StuFileInfoExample example);

    int updateByExample(@Param("record")
    StuFileInfo record, @Param("example")
    StuFileInfoExample example);

    int updateByPrimaryKeySelective(StuFileInfo record);

    int updateByPrimaryKey(StuFileInfo record);
}

