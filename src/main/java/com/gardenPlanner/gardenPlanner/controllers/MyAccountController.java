package com.gardenPlanner.gardenPlanner.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users/myaccount")
public class MyAccountController {

    @GetMapping(value = "")
    public String loadMyAccount(){

        return "users/myaccount";
    }
}
