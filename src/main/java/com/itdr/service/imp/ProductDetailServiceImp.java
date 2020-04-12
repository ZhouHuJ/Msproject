package com.itdr.service.imp;


import com.itdr.mapper.ProductDetailMapper;
import com.itdr.pojo.ProductDetail;
import com.itdr.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailServiceImp implements ProductDetailService {

    @Autowired
    ProductDetailMapper productDetailMapper;
    /*
    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = productDetailMapper.deleteByPrimaryKey(id);
        return i;
    }
    */

    @Override
    public void insert(ProductDetail productDetail) {
        productDetailMapper.insert(productDetail);
    }

    @Override
    public void insertSelective(ProductDetail productDetail) {

    }

    @Override
    public ProductDetail selectByPrimaryKey(Integer productid) {
        return productDetailMapper.selectByPrimaryKey(productid);
    }

    @Override
    public void updateByPrimaryKeySelective(ProductDetail productDetail) {
        productDetailMapper.updateByPrimaryKeySelective(productDetail);

    }

    @Override
    public void updateByPrimaryKey(ProductDetail productDetail) {

    }

    @Override
    public void deleteByProductid(int productid) {
        productDetailMapper.deleteByProductid(productid);
    }
}
