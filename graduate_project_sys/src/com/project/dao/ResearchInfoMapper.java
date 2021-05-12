package com.project.dao;

import com.project.model.ResearchInfo;
import com.project.model.ResearchInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ResearchInfoMapper {
    long countByExample(ResearchInfoExample example);

    int deleteByExample(ResearchInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResearchInfo record);

    int insertSelective(ResearchInfo record);

    List<ResearchInfo> selectByExample(ResearchInfoExample example);

    ResearchInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    ResearchInfo record, @Param("example")
    ResearchInfoExample example);

    int updateByExample(@Param("record")
    ResearchInfo record, @Param("example")
    ResearchInfoExample example);

    int updateByPrimaryKeySelective(ResearchInfo record);

    int updateByPrimaryKey(ResearchInfo record);
}

