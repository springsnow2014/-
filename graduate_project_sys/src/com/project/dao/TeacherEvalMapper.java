package com.project.dao;

import com.project.model.TeacherEval;
import com.project.model.TeacherEvalExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TeacherEvalMapper {
    long countByExample(TeacherEvalExample example);

    int deleteByExample(TeacherEvalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherEval record);

    int insertSelective(TeacherEval record);

    List<TeacherEval> selectByExample(TeacherEvalExample example);

    TeacherEval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    TeacherEval record, @Param("example")
    TeacherEvalExample example);

    int updateByExample(@Param("record")
    TeacherEval record, @Param("example")
    TeacherEvalExample example);

    int updateByPrimaryKeySelective(TeacherEval record);

    int updateByPrimaryKey(TeacherEval record);
}

