package com.itdr.controller;

import com.itdr.pojo.ProductDetail;
import com.itdr.pojo.Products;
import com.itdr.pojo.vo.ConstomProduct;
import com.itdr.pojo.vo.ProductVo;
import com.itdr.service.ProductDetailService;
import com.itdr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/pagehome/")
public class PagehomeController {

    @Autowired
    ProductService productService;

    @Autowired
    ProductDetailService productDetailService;

    @RequestMapping("tohome.do")
    public String tohome(HttpServletRequest request){
        ProductVo productVo = new ProductVo();
        ConstomProduct constomProduct = new ConstomProduct();
        Date now = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowstring = dateFormat.format(now);
        constomProduct.setStartendtime(nowstring);
        constomProduct.setAuditstatus(2);
        productVo.setConstomProduct(constomProduct);
//		private Date startstarttime;//��ɱ��ʼʱ���ѯ��Χ��ʼʱ��
//		private Date endstarttime;//��ɱ��ʼʱ���ѯ��Χ����ʱ��
        List<Products> list = productService.selectByvo(productVo);
        request.setAttribute("list", list);
        return "homepage/homepage";
    }

    @RequestMapping("viewproductdetail.do")
    public String viewproductdetail(HttpServletRequest req,int id){
        Products product = productService.selectByPrimaryKey(id);
        ProductDetail productDetail = productDetailService.selectByPrimaryKey(product.getProductid());
        req.setAttribute("product", product);
        req.setAttribute("productDetail", productDetail);
        return "order/selldetail";
    }
}
