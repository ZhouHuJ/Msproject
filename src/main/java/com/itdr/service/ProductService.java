package com.itdr.service;

import com.itdr.pojo.vo.ProductVo;
import com.itdr.pojo.Products;

import java.util.List;

public interface ProductService {
    void applyproduct(Products product);

    void deleteByPrimaryKey(Integer id);

    void insertSelective(Products record);

    Products selectByPrimaryKey(Integer id);

    //根据vo条件查询
    List<Products> selectByvo(ProductVo productVo);

    void updateByPrimaryKeySelective(Products record);

    void updateByPrimaryKey(Products record);
}
