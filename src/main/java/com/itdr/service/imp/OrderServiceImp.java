package com.itdr.service.imp;

import com.itdr.mapper.OrdersMapper;
import com.itdr.pojo.Orders;
import com.itdr.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    OrdersMapper ordersMapper;

    @Override
    public void insertMsOrder(Orders order) {
        ordersMapper.insertSelective(order);
    }

    @Override
    public List<Orders> selectorderByUserid(int userid) {
        return ordersMapper.selectorderByUserid(userid);
    }

    @Override
    public List<Orders> selectorderByMerchantid(int merchantid) {
        return ordersMapper.selectorderByMerchantid(merchantid);
    }

    @Override
    public void updateByPrimaryKeySelective(Orders orders) {
        ordersMapper.updateByPrimaryKeySelective(orders);
    }
}
