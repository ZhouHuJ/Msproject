package com.itdr.mapper;

import com.itdr.pojo.vo.MerchantVo;
import com.itdr.pojo.Merchant;

import java.util.List;

public interface MerchantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Integer id);

    List<Merchant> selectByvo(MerchantVo merchantVo);

    Merchant selectBymerchantaccount(String merchantaccount);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}