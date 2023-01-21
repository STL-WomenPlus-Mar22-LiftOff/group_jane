package com.gardenPlanner.gardenPlanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Controller
public class HomeController {

    @GetMapping(value = "")
    public String index() {

//        HashMap<String, String> actionChoices = new HashMap<>();
//        actionChoices.put("search", "Search");
//        actionChoices.put("list", "List");
//
//        model.addAttribute("actions", actionChoices);

        return "index";
    }

}