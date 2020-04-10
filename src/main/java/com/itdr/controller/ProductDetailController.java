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

    @RequestMapping("toadd.do")
    public String toadd(HttpServletRequest request,int productid,int merchantid){
        request.setAttribute("productid",productid);
        request.setAttribute("merchantid",merchantid);
        return "productdetail/add";
    }

    @RequestMapping("add.do")
    public String add(ProductDetail productDetail){
        productDetailService.insert(productDetail);
        return "redirect:/product/selbyvo.do";
    }

    @RequestMapping("toupdate.do")
    public String toupdate(HttpServletRequest request,int productid){
        ProductDetail productDetail = productDetailService.selectByPrimaryKey(productid);
        request.setAttribute("productDetail",productDetail);
        return "productdetail/update";
    }

    @RequestMapping("update.do")
    public String  update(ProductDetail productDetail){
        productDetailService.updateByPrimaryKeySelective(productDetail);
        return "redirect:/product/selbyvo.do";
    }

    @RequestMapping("selbyproid.do")
    public String selbyid(HttpServletRequest request, int productid){
        ProductDetail productDetail = productDetailService.selectByPrimaryKey(productid);
        request.setAttribute("productdetail",productDetail);
        return "productdetail/view";
    }
}
