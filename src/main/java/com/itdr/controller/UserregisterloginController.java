package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/registerlogin/")
public class UserregisterloginController {

    @Autowired
    UserService userService;

    @Autowired
    PagehomeController pagehomeController;

    //用户注册
    @RequestMapping("toregister.do")
    public String toregister(){
        return "user/register";
    }

    @RequestMapping(value = "register.do",method = RequestMethod.POST)
    public String register(Users user,String zzz){
        userService.insert(user);
        return "redirect:/registerlogin/tologin.do";
    }

    //用户登入
    @RequestMapping("tologin.do")
    public String tologin(){
        return "user/login";
    }

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public String login(HttpServletRequest request,Users user){
        String useraccount = user.getUseraccount();
        String userpassword = user.getUserpassword();
        Users userresult = userService.selectByuseraccount(useraccount);
        if (userresult == null){
            request.setAttribute("errorinfo", "用户不存在");
            return "forward:/registerlogin/tologin.do";
        }else if(!userresult.getUserpassword().equals(userpassword)){
            request.setAttribute("errorinfo", "密码错误");
            return "forward:/registerlogin/tologin.do";
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("user", userresult);
            return  "redirect:/pagehome/tohome.do";
        }
    }

    //用户退出登入
    @RequestMapping(value = "exit.do")
    public String exit(HttpServletRequest request){
        HttpSession sess = request.getSession();
        sess.removeAttribute("user");
        return "redirect:http://localhost:8080";
    }
}
