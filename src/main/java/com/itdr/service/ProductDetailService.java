package com.itdr.service;

import com.itdr.pojo.ProductDetail;

public interface ProductDetailService {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductDetail productDetail);

    int insertSelective(ProductDetail productDetail);

    ProductDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductDetail productDetail);

    int updateByPrimaryKey(ProductDetail productDetail);
}
