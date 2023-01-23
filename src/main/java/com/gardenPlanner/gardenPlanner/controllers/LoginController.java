package com.gardenPlanner.gardenPlanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping
    public String loginWelcome(){
        return "Login to view your garden";
    }
    @GetMapping("loginform")
    public String loginForm(){
        return "";
    }
    @GetMapping("loginconfirmed")
    public String loginConfirmed(){
        return "You are logged in!";
    }
    @GetMapping("logout")
    public String logoutConfirmed(){
        return "You have logged out";
    }
}
