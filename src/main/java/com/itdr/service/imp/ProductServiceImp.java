package com.itdr.service.imp;

import com.itdr.mapper.ProductsMapper;
import com.itdr.pojo.Products;
import com.itdr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductsMapper productsMapper;

    @Override
    public int applyproduct(Products product) {
        int i = productsMapper.insert(product);
        return i;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = productsMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insertSelective(Products record) {
        return 0;
    }

    @Override
    public Products selectByPrimaryKey(Integer id) {
        return productsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Products record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Products record) {
        int i = productsMapper.updateByPrimaryKeySelective(record);
        return i;
    }
}
