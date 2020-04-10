package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/registerlogin/")
public class UserregisterloginController {

    @Autowired
    UserService userService;

    //用户注册
    @RequestMapping("toregister.do")
    public String toregister(){
        return "user/register";
    }

    @RequestMapping(value = "register.do",method = RequestMethod.POST)
    public String register(Users user,String zzz){
        userService.insert(user);
        return "/homepage/homepage";
    }

    //用户登入
    @RequestMapping("tologin.do")
    public String tologin(){
        return "user/login";
    }

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public String login(HttpServletRequest request, Users user){
        String returnurl = "homepage/error";
        String useraccount = user.getUseraccount();
        String userpassword = user.getUserpassword();
        Users userresult = userService.selectByuseraccount(useraccount);
        if (userresult == null){
            System.out.println("用户不存在");
            request.setAttribute("errorinfo", "用户不存在");
        }else if(!userresult.getUserpassword().equals(userpassword)){
            System.out.println("密码错误");
            request.setAttribute("errorinfo", "密码错误");
        }else{
            HttpSession sess = request.getSession();
            sess.setAttribute("user", userresult);
            returnurl = "homepage/homepage";
        }
        return returnurl;
    }

    //用户退出登入
    @RequestMapping(value = "exit.do")
    public String exit(HttpServletRequest request){
        HttpSession sess = request.getSession();
        sess.removeAttribute("users");
        return "homepage/homepage";
    }
}
