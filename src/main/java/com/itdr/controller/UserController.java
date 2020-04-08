package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("add.do")
    public void add(Users user){
        System.out.println(userService.insert(user));
    }

    @RequestMapping("update.do")
    public void  update(Users user){
        System.out.println(userService.updateByPrimaryKeySelective(user));
    }

    @RequestMapping("del.do")
    public void  del(int id){
        System.out.println(userService.deleteByPrimaryKey(id));
    }

    @RequestMapping("sel.do")
    public String selbyid(HttpServletRequest request, int id){
        Users merchant = userService.selectByPrimaryKey(id);
        request.setAttribute("merchant",merchant);
        return "merchant/view";
    }
}
