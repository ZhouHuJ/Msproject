package com.itdr.controller;

import com.itdr.pojo.Merchant;
import com.itdr.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/merchantregisterlogin/")
public class MerchantregisterloginController {

    @Autowired
    MerchantService merchantService;

    //商家注册
    @RequestMapping("toregister.do")
    public String toregister(){
        return "merchant/register";
    }

    @RequestMapping(value = "register.do",method = RequestMethod.POST)
    public String register(Merchant merchant){
        merchantService.insert(merchant);
        return "/adminpagehome/homepage";
    }

    //商家登入
    @RequestMapping("tologin.do")
    public String tologin(){
        return "merchant/login";
    }

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public String login(HttpServletRequest request, Merchant merchant){
        String returnurl = "adminpagehome/error";
        String merchantaccount = merchant.getMerchantaccount();
        String merchantpassword = merchant.getMerchantpassword();
        Merchant merchantresult = merchantService.selectBymerchantaccount(merchantaccount);
        if (merchantresult == null){
            System.out.println("商家不存在");
            request.setAttribute("errorinfo", "商家不存在");
        }else if(!merchantresult.getMerchantpassword().equals(merchantpassword)){
            
            request.setAttribute("errorinfo", "密码错误");
        }else{
            HttpSession sess = request.getSession();
            sess.setAttribute("users", merchantresult);
            returnurl = "adminpagehome/homepage";
        }
        return returnurl;
    }

    //用户退出登入
    @RequestMapping(value = "exit.do")
    public String exit(HttpServletRequest request){
        HttpSession sess = request.getSession();
        sess.removeAttribute("users");
        return "adminpagehome/homepage";
    }
}
