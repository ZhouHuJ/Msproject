package com.itdr.service.imp;

import com.itdr.pojo.vo.UsersVo;
import com.itdr.mapper.UsersMapper;
import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public void deleteByPrimaryKey(Integer id) {
        usersMapper.deleteByPrimaryKey(id);

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
    public List<Users> selectByvo(UsersVo usersVo) {
        return usersMapper.selectByvo(usersVo);
    }

    @Override
    public Users selectByuseraccount(String useraccount) {
        return usersMapper.selectByuseraccount(useraccount);
    }

    @Override
    public void updateByPrimaryKeySelective(Users record) {
        usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void updateByPrimaryKey(Users record) {

    }
}
