package com.itdr.mapper;

import com.itdr.pojo.vo.ProductVo;
import com.itdr.pojo.Products;

import java.util.List;

public interface ProductsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Products record);

    int insertSelective(Products record);

    Products selectByPrimaryKey(Integer id);

    List<Products> selectByvo(ProductVo productVo);

    int updateByPrimaryKeySelective(Products record);

    int updateByPrimaryKey(Products record);
}