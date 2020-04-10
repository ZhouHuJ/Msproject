package com.itdr.mapper;

import com.itdr.pojo.Orders;

import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    List<Orders> selectorderByUserid(int userid);

    List<Orders> selectorderByMerchantid(int merchantid);
}