package com.itdr.service;

import com.itdr.pojo.Orders;

import java.util.List;

public interface OrderService {
    public void insertMsOrder(Orders order);

    public List<Orders> selectorderByUserid(int userid);

    public List<Orders> selectorderByMerchantid(int merchantid);

    public void updateByPrimaryKeySelective(Orders orders);
}
