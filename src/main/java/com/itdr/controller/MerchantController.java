package com.itdr.controller;

import com.itdr.pojo.vo.MerchantVo;
import com.itdr.pojo.Merchant;
import com.itdr.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/merchant/")
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    //同商家注册（MerchantregisterloginController的注册）
    @RequestMapping("toadd.do")
    public String toadd(){
        return "merchant/add";
    }

    @RequestMapping(value = "add.do",method = RequestMethod.POST)
    public String add(Merchant merchant){
        merchantService.insert(merchant);
        return "redirect:selbyvo.do";
    }

    //商家修改更新信息
    @RequestMapping("toupdate.do")
    public String toupdate(HttpServletRequest request,int id){
        Merchant merchant = merchantService.selectByPrimaryKey(id);
        request.setAttribute("merchant", merchant);
        return "merchant/update";
    }

    @RequestMapping(value = "update.do",method = RequestMethod.POST)
    public String  update(HttpServletRequest request,Merchant merchant){
        request.setAttribute("merchant", merchant);
        merchantService.updateByPrimaryKeySelective(merchant);
        return "redirect:selbyvo.do";
    }

    //根据id删除商家
    @RequestMapping(value = "del.do")
    public String  del(int id){
        merchantService.deleteByPrimaryKey(id);
        return "redirect:selbyvo.do";
    }

    //根据id查看商家
    @RequestMapping("selbyid.do")
    public String selbyid(HttpServletRequest request, int id){
        Merchant merchant = merchantService.selectByPrimaryKey(id);
        request.setAttribute("merchant",merchant);
        return "merchant/view";
    }

    @RequestMapping("selbyvo.do")
    public String selbyvo(HttpServletRequest request,MerchantVo merchantVo){
        List<Merchant> list = merchantService.selectByvo(merchantVo);
        request.setAttribute("merchantlist", list);
        return "merchant/list";
    }
}
