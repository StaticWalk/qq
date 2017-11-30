package com.iot.controller;

import com.iot.domain.QQUser;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiongxiaoyu on 2017/11/19.
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    public String user(@AuthenticationPrincipal UsernamePasswordAuthenticationToken userAuthentication, Model model){
        QQUser user = (QQUser) userAuthentication.getPrincipal();
        model.addAttribute("username", user.getNickname());
        model.addAttribute("avatar", user.getAvatar());
        return "user/user";
    }

}
