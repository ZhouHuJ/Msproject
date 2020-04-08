package com.itdr.mapper;

import com.itdr.pojo.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    Users selectByuseraccount(String useraccount);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}