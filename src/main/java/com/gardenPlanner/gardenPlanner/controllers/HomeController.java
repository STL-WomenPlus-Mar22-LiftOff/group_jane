package com.gardenPlanner.gardenPlanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {

    @GetMapping(value = "")
    public String index() {
        return "index";
    }

}
//        HashMap<String, String> actionChoices = new HashMap<>();
//        actionChoices.put("search", "Search");
//        actionChoices.put("list", "List");
//
//        model.addAttribute("actions", actionChoices);