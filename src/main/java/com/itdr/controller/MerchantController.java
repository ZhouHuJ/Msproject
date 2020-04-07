package com.itdr.controller;

import com.itdr.pojo.Merchant;
import com.itdr.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/merchant/")
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @RequestMapping("add.do")
    public void add(Merchant merchant){
        System.out.println(merchantService.insert(merchant));
    }

    @RequestMapping("update.do")
    public void  update(Merchant merchant){
        System.out.println(merchantService.updateByPrimaryKeySelective(merchant));
    }

    @RequestMapping("del.do")
    public void  del(int id){
        System.out.println(merchantService.deleteByPrimaryKey(id));
    }

    @RequestMapping("sel.do")
    public String selbyid(HttpServletRequest request, int id){
        Merchant merchant = merchantService.selectByPrimaryKey(id);
        request.setAttribute("merchant",merchant);
        return "merchant/view";
    }
}
