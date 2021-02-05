package com.icbc.provider.dao;

import com.icbc.provider.model.DubboDo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DubboServiceDao {
    int deleteByPrimaryKey(Integer id);

    int insert(DubboDo record);

    int insertSelective(DubboDo record);

    DubboDo selectByPrimaryKey(Integer id);

    DubboDo selectByName(String name);

    int updateByPrimaryKeySelective(DubboDo record);

    int updateByPrimaryKey(DubboDo record);
}