package com.itdr.service;

import com.itdr.pojo.Users;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    Users selectByuseraccount(String useraccount);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}
