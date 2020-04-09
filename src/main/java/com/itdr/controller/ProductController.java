package com.itdr.controller;

import com.itdr.pojo.vo.ProductVo;
import com.itdr.pojo.Products;
import com.itdr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/product/")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value="toapplyproduct.do")
    public String toApplymsproduct(){
        return "product/applyproduct";
    }

    @RequestMapping(value = "applyproduct.do",method = RequestMethod.POST)
    public String  applyproduct(Products product) {
        productService.applyproduct(product);
        return "redirect:selbyvo.do";
    }

    @RequestMapping(value="selbyvo.do")
    public String selByvo(HttpServletRequest request,ProductVo productVo){
        List<Products> list =  productService.selectByvo(productVo);
        request.setAttribute("productlist", list);
        return "product/list";
    }

    @RequestMapping(value="toupdate.do")
    public String toupdatemsproduct(HttpServletRequest req,int id){
        Products  product = productService.selectByPrimaryKey(id);
        req.setAttribute("product", product);
        return "product/update";
    }


    @RequestMapping(value = "update.do",method = RequestMethod.POST)
    public String  update(Products product){
        productService.updateByPrimaryKeySelective(product);
        return "redirect:selbyvo.do";
    }

    @RequestMapping("del.do")
    public String  del(int id){
        productService.deleteByPrimaryKey(id);
        return "redirect:selbyvo.do";
    }

    @RequestMapping("sel.do")
    public String selbyid(HttpServletRequest request, int id){
        Products product = productService.selectByPrimaryKey(id);
        request.setAttribute("product",product);
        return "product/view";
    }
}
