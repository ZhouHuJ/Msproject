package com.itdr.controller;

import com.itdr.pojo.Products;
import com.itdr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/product/")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "applyproduct.do",method = RequestMethod.POST)
    public void applyproduct(Products product) {
        productService.applyproduct(product);
    }

    @RequestMapping("update.do")
    public void  update(Products product){
        System.out.println(productService.updateByPrimaryKeySelective(product));
    }

    @RequestMapping("del.do")
    public void  del(int id){
        System.out.println(productService.deleteByPrimaryKey(id));
    }

    @RequestMapping("sel.do")
    public String selbyid(HttpServletRequest request, int id){
        Products merchant = productService.selectByPrimaryKey(id);
        request.setAttribute("merchant",merchant);
        return "merchant/view";
    }
}
