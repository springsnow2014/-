package com.project.dao;

import com.project.model.ChatLog;
import com.project.model.ChatLogExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ChatLogMapper {
    long countByExample(ChatLogExample example);

    int deleteByExample(ChatLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChatLog record);

    int insertSelective(ChatLog record);

    List<ChatLog> selectByExample(ChatLogExample example);

    ChatLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    ChatLog record, @Param("example")
    ChatLogExample example);

    int updateByExample(@Param("record")
    ChatLog record, @Param("example")
    ChatLogExample example);

    int updateByPrimaryKeySelective(ChatLog record);

    int updateByPrimaryKey(ChatLog record);
}

