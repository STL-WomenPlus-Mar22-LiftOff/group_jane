package com.gardenPlanner.gardenPlanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("garden/mygarden")
public class GardenAreaController {

    @GetMapping("")
    public String loadMyGarden() {

        return "garden/mygarden";
    }
}
