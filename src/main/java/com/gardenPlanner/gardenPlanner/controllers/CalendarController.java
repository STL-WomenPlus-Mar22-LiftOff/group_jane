package com.gardenPlanner.gardenPlanner.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("calendar")
public class CalendarController {

    @GetMapping("")
    public String loadCalendar() {

        return "calendar";
    }
}
