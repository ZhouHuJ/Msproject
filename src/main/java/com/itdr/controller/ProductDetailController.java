package com.itdr.controller;
import com.itdr.pojo.ProductDetail;
import com.itdr.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/productdetail/")
public class ProductDetailController {

    @Autowired
    ProductDetailService productDetailService;

    @RequestMapping("add.do")
    public void add(ProductDetail productDetail){
        System.out.println(productDetailService.insert(productDetail));
    }

    @RequestMapping("update.do")
    public void  update(ProductDetail productDetail){
        System.out.println(productDetailService.updateByPrimaryKeySelective(productDetail));
    }

    @RequestMapping("del.do")
    public void  del(int id){
        System.out.println(productDetailService.deleteByPrimaryKey(id));
    }

    @RequestMapping("sel.do")
    public String selbyid(HttpServletRequest request, int id){
        ProductDetail productDetail = productDetailService.selectByPrimaryKey(id);
        request.setAttribute("merchant",productDetail);
        return "merchant/view";
    }
}
