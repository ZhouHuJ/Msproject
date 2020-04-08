package com.itdr.service;

import com.itdr.pojo.Merchant;

public interface MerchantService {

    int deleteByPrimaryKey(Integer id);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Integer id);

    Merchant selectBymerchantaccount(String merchantaccount);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}
