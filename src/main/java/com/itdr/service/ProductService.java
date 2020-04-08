package com.itdr.service;

import com.itdr.pojo.Products;

public interface ProductService {
    int applyproduct(Products product);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Products record);

    Products selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Products record);

    int updateByPrimaryKey(Products record);
}
