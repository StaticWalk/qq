package com.iot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiongxiaoyu on 2017/11/19.
 */
@Controller
public class HomeController {

    @RequestMapping({"/", "/index", "/home"})
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
