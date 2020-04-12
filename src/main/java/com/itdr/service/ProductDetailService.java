package com.itdr.service;

import com.itdr.pojo.ProductDetail;

public interface ProductDetailService {
    //int deleteByPrimaryKey(Integer id);

    void insert(ProductDetail productDetail);

    void insertSelective(ProductDetail productDetail);

    ProductDetail selectByPrimaryKey(Integer productid);

    void updateByPrimaryKeySelective(ProductDetail productDetail);

    void updateByPrimaryKey(ProductDetail productDetail);

    void deleteByProductid(int productid);
}
