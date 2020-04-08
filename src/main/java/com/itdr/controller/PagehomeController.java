package com.itdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pagehome/")
public class PagehomeController {

    @RequestMapping("tohome.do")
    public String tohome(){
        return "adminpagehome/homepage";
    }
}
