package com.gardenPlanner.gardenPlanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users")
public class LoginController {
    @GetMapping("")
    public String loginWelcome(){
        return "users/login";
    }
//    @GetMapping("")
//    public String loginForm(){
//        return "";
//    }
//    @GetMapping("loginconfirmed")
//    public String loginConfirmed(){
//        return "You are logged in!";
//    }
//    @GetMapping("logout")
//    public String logoutConfirmed(){
//        return "You have logged out";
//    }
}
