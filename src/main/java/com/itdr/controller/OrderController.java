package com.itdr.controller;

import com.itdr.pojo.Merchant;
import com.itdr.pojo.Orders;
import com.itdr.pojo.Products;
import com.itdr.pojo.Users;
import com.itdr.service.OrderService;
import com.itdr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/order/")
public class OrderController {

    @Autowired
    ProductService productService;

    @Autowired
    OrderService orderService;

    @RequestMapping("topay.do")
    public String topayorder(HttpServletRequest request, int id, int num){
        Products product = productService.selectByPrimaryKey(id);
        request.setAttribute("product", product);
        request.setAttribute("productnum", num);
        int payamount = num * product.getMiaoshaprice();
        request.setAttribute("payamount", payamount);
        HttpSession sess = request.getSession();
        Users user = (Users) sess.getAttribute("user");
        if(user != null ){
            request.setAttribute("userid", user.getId());
        }else{
            request.setAttribute("error", "用户未登入");
            return "redirect:/registerlogin/tologin.do";
        }
        return "/order/pay";

    }

    @RequestMapping(value = "pay.do",method = RequestMethod.POST)
    public String payorder(Orders order){
        Date now = new Date();
        order.setCreatetime(now);
        int paystatus = 1;
        order.setPaystatus(paystatus);
        String tradeserialnumber = UUID.randomUUID().toString();
        order.setTradeserialnumble(tradeserialnumber);
        orderService.insertMsOrder(order);
        return "redirect:/pagehome/tohome.do";

    }

    @RequestMapping("selectorderbyuserid.do")
    public String selectorderByUserid(HttpServletRequest request){
        String returnurl = "order/list";
        HttpSession sess = request.getSession();
        Users user = (Users) sess.getAttribute("user");
        if(user!=null){
            List<Orders> list = orderService.selectorderByUserid(user.getId());
            request.setAttribute("list", list);
        }else{
            request.setAttribute("error", "用户未登入");
            returnurl = "user/tologin.do";
        }

        return returnurl;

    }

    @RequestMapping("selectorderbymerchantid.do")
    public String selectorderByMerchantid(HttpServletRequest request){
        String returnurl = "order/list";
        HttpSession sess = request.getSession();
        Merchant merchant = (Merchant) sess.getAttribute("merchant");
        if(merchant!=null){
            List<Orders> list = orderService.selectorderByMerchantid(merchant.getId());
            request.setAttribute("list", list);
        }else{
            request.setAttribute("error", "商家未登入");
            returnurl = "/merchant/tologin.do";
        }

        return returnurl;

    }

    @RequestMapping("topaymoney.do")
    public String topaywithorder(HttpServletRequest request,int id,String tradeserialnumble, int payamount){
        request.setAttribute("id", id);
        request.setAttribute("tradeserialnumble", tradeserialnumble);
        request.setAttribute("payamount", payamount);
        return "/order/paymoney";

    }

    @RequestMapping(value="paymoney.do",method=RequestMethod.POST)
    public String paywithorder(int paytype,Orders order){
        int paystatus = 1;
        if(paytype == 1){
            //支付宝支付
            paystatus = 2;
        }else if(paytype == 2){
            //微信支付
            paystatus = 2;
        }else if(paytype == 3){
            //银行卡支付
            paystatus = 2;
        }
        if(paystatus == 2){
            order.setPaystatus(paystatus);
            orderService.updateByPrimaryKeySelective(order);
        }
        return "redirect:/order/selectorderbyuserid.do";

    }

    @RequestMapping("cancelorder.do")
    public String cancelorder(Orders order){
        order.setPaystatus(3);
        orderService.updateByPrimaryKeySelective(order);
        return "redirect:/order/selectorderbyuserid.do";
    }

    @RequestMapping("refund.do")
    public String refund(Orders order){
        order.setPaystatus(4);
        orderService.updateByPrimaryKeySelective(order);
        return "redirect:/order/selectorderbyuserid.do";
    }

    @RequestMapping("agreerefund.do")
    public String agreerefund(Orders order){
        order.setPaystatus(5);
        orderService.updateByPrimaryKeySelective(order);
        return "redirect:/order/selectorderbyuserid.do";
    }
}
