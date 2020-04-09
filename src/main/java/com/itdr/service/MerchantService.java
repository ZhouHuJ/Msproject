package com.itdr.service;

import com.itdr.pojo.vo.MerchantVo;
import com.itdr.pojo.Merchant;

import java.util.List;

public interface MerchantService {

    void deleteByPrimaryKey(Integer id);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Integer id);

    //根据vo条件查询
    List<Merchant> selectByvo(MerchantVo merchantVo);

    Merchant selectBymerchantaccount(String merchantaccount);

    void updateByPrimaryKeySelective(Merchant record);

    void updateByPrimaryKey(Merchant record);
}
