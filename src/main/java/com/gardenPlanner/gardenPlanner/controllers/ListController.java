package com.gardenPlanner.gardenPlanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
@RequestMapping(value = "list/plantlist")
public class ListController {


    @GetMapping("")
    public String list(){
        return "list/plantlist";
    }

    static HashMap<String, String> columnChoices = new HashMap<>();
    static HashMap<String, Object> tableChoices = new HashMap<>();

    public ListController() {
//        columnChoices.put("all", "All");
//        columnChoices.put("employer", "Employer");
//        columnChoices.put("location", "Location");
//        columnChoices.put("positionType", "Position Type");
//        columnChoices.put("coreCompetency", "Skill");
//
//        tableChoices.put("all", "View All");
//        tableChoices.put("employer", JobData.getAllEmployers());
//        tableChoices.put("location", JobData.getAllLocations());
//        tableChoices.put("positionType", JobData.getAllPositionTypes());
//        tableChoices.put("coreCompetency", JobData.getAllCoreCompetency());
    }

//    @GetMapping(value = "")
//    public String list(Model model) {
//        model.addAttribute("columns", columnChoices);
//        model.addAttribute("tableChoices", tableChoices);
//        model.addAttribute("employers", JobData.getAllEmployers());
//        model.addAttribute("locations", JobData.getAllLocations());
//        model.addAttribute("positions", JobData.getAllPositionTypes());
//        model.addAttribute("skills", JobData.getAllCoreCompetency());
//        model.addAttribute("all", JobData.findAll());
//
//        return "list";
//    }

    @GetMapping(value = "jobs")
    public String listJobsByColumnAndValue(Model model, @RequestParam String column, @RequestParam(required = false) String value) {
//        ArrayList<Job> jobs;
//        if (column.equals("all")){
//            jobs = JobData.findAll();
//            model.addAttribute("title", "All Jobs");
//        } else {
//            jobs = JobData.findByColumnAndValue(column, value);
//            model.addAttribute("title", "Jobs with " + columnChoices.get(column) + ": " + value);
//        }
//        model.addAttribute("jobs", jobs);

        return "list-jobs";
    }

}