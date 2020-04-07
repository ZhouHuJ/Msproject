package com.itdr.service.imp;

import com.itdr.mapper.MerchantMapper;
import com.itdr.pojo.Merchant;
import com.itdr.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantServiceImp implements MerchantService {

    @Autowired
    MerchantMapper merchantMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = merchantMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(Merchant record) {
        int i = merchantMapper.insert(record);
        return i;
    }

    @Override
    public int insertSelective(Merchant record) {
        return 0;
    }

    @Override
    public Merchant selectByPrimaryKey(Integer id) {
        return merchantMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Merchant record) {
        int i = merchantMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int updateByPrimaryKey(Merchant record) {
        return 0;
    }
}
