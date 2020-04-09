package com.itdr.service;

import com.itdr.pojo.vo.UsersVo;
import com.itdr.pojo.Users;

import java.util.List;

public interface UserService {
    void deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    //根据vo条件查询
    List<Users> selectByvo(UsersVo usersVo);

    Users selectByuseraccount(String useraccount);

    void updateByPrimaryKeySelective(Users record);

    void updateByPrimaryKey(Users record);
}
