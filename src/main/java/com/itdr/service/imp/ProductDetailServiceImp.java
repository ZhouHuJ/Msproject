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

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = productDetailMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public int insert(ProductDetail productDetail) {
        int i = productDetailMapper.insert(productDetail);
        return i;
    }

    @Override
    public int insertSelective(ProductDetail productDetail) {
        return 0;
    }

    @Override
    public ProductDetail selectByPrimaryKey(Integer id) {
        return productDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductDetail productDetail) {
        int i = productDetailMapper.updateByPrimaryKeySelective(productDetail);
        return i;
    }

    @Override
    public int updateByPrimaryKey(ProductDetail productDetail) {
        return 0;
    }
}
