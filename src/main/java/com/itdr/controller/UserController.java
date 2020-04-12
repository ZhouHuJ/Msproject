package com.itdr.controller;

import com.itdr.pojo.vo.UsersVo;
import com.itdr.pojo.Users;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserService userService;

    //同用户注册（MerchantregisterloginController的注册）
    @RequestMapping("toadd.do")
    public String toadd(){
        return "user/add";
    }

    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public String add(Users user){
        userService.insert(user);
        return "redirect:selbyvo.do";
    }

    //用户修改更新信息
    @RequestMapping("toupdate.do")
    public String toupdate(HttpServletRequest request,int id){
        Users user = userService.selectByPrimaryKey(id);
        request.setAttribute("user", user);
        return "user/update";
    }

    @RequestMapping(value = "update.do",method = RequestMethod.POST)
    public String  update(Users user){
        userService.updateByPrimaryKeySelective(user);
        return "redirect:selbyvo.do";
    }

    @RequestMapping("del.do")
    public String  del(int id){
        userService.deleteByPrimaryKey(id);
        return "redirect:selbyvo.do";
    }

    @RequestMapping("selbyid.do")
    public String selbyid(HttpServletRequest request, int id){
        Users user = userService.selectByPrimaryKey(id);
        request.setAttribute("user",user);
        return "user/view";
    }

    @RequestMapping("selbyvo.do")
    public String querybyvo(HttpServletRequest request,UsersVo usersVo){
        List<Users> list = userService.selectByvo(usersVo);
        request.setAttribute("userlist", list);
        return "user/list";
    }

    @RequestMapping("toUserHomePage.do")
    public String toUserHomePage(){
        return "user/homepage";
    }
}
