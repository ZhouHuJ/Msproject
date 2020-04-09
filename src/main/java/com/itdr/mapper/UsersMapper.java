package com.itdr.mapper;

import com.itdr.pojo.vo.UsersVo;
import com.itdr.pojo.Users;

import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    List<Users> selectByvo(UsersVo usersVo);

    Users selectByuseraccount(String useraccount);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}