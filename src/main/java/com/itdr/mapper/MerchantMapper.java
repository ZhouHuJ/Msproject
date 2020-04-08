package com.itdr.mapper;

import com.itdr.pojo.Merchant;

public interface MerchantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Integer id);

    Merchant selectBymerchantaccount(String merchantaccount);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}