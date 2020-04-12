package com.itdr.service.imp;

import com.itdr.pojo.vo.ProductVo;
import com.itdr.mapper.ProductsMapper;
import com.itdr.pojo.Products;
import com.itdr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductsMapper productsMapper;

    @Override
    public void applyproduct(Products product) {
        String startstring = product.getStarttimestring();
        String endstring = product.getEndtimestring();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            product.setStarttime(formatter.parse(startstring));
            product.setEndtime(formatter.parse(endstring));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        product.setApplydate(new Date());
        product.setAuditstatus(1);
        productsMapper.insertSelective(product);
    }

    @Override
    public void deleteByPrimaryKey(Integer id) {
    productsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertSelective(Products record) {

    }

    @Override
    public Products selectByPrimaryKey(Integer id) {
        Products products = productsMapper.selectByPrimaryKey(id);
        Date starttime = products.getStarttime();
        Date endtime = products.getEndtime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String sstr = products.getStarttimestring();
        sstr = formatter.format(starttime);
        String estr = products.getEndtimestring();
        estr = formatter.format(endtime);
        return products;
    }

    @Override
    public List<Products> selectByvo(ProductVo productVo) {
        return productsMapper.selectByvo(productVo);
    }

    @Override
    public void updateByPrimaryKeySelective(Products product) {
        productsMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public void updateByPrimaryKey(Products record) {

    }
}
