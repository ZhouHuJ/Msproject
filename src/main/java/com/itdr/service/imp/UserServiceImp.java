package com.itdr.service.imp;

import com.itdr.mapper.UsersMapper;
import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = usersMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(Users record) {
        int i = usersMapper.insert(record);
        return i;
    }

    @Override
    public int insertSelective(Users record) {
        return 0;
    }

    @Override
    public Users selectByPrimaryKey(Integer id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        int i = usersMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return 0;
    }
}
