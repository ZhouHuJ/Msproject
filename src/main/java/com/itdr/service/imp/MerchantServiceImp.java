package com.itdr.service.imp;

import com.itdr.pojo.vo.MerchantVo;
import com.itdr.mapper.MerchantMapper;
import com.itdr.pojo.Merchant;
import com.itdr.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImp implements MerchantService {

    @Autowired
    MerchantMapper merchantMapper;

    @Override
    public void deleteByPrimaryKey(Integer id) {
        merchantMapper.deleteByPrimaryKey(id);
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
    public List<Merchant> selectByvo(MerchantVo merchantVo) {
        return merchantMapper.selectByvo(merchantVo);
    }

    @Override
    public Merchant selectBymerchantaccount(String merchantaccount) {
        return merchantMapper.selectBymerchantaccount(merchantaccount);
    }

    @Override
    public void updateByPrimaryKeySelective(Merchant record) {
        merchantMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void updateByPrimaryKey(Merchant record) {

    }
}
