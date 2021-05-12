package com.project.dao;

import com.project.model.StuApplyLog;
import com.project.model.StuApplyLogExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StuApplyLogMapper {
    long countByExample(StuApplyLogExample example);

    int deleteByExample(StuApplyLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StuApplyLog record);

    int insertSelective(StuApplyLog record);

    List<StuApplyLog> selectByExample(StuApplyLogExample example);

    StuApplyLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    StuApplyLog record, @Param("example")
    StuApplyLogExample example);

    int updateByExample(@Param("record")
    StuApplyLog record, @Param("example")
    StuApplyLogExample example);

    int updateByPrimaryKeySelective(StuApplyLog record);

    int updateByPrimaryKey(StuApplyLog record);
}

