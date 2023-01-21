package com.gardenPlanner.gardenPlanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("search")
public class SearchController {

    public SearchController() {
    }

    @GetMapping("")
    public String search(Model model) {
//        model.addAttribute("columns", columnChoices);
        return "search";
    }

    @PostMapping("results")
    public String displaySearchResults(Model model, @RequestParam String searchTerm, @RequestParam String searchType) {
//        List<Job> jobs;
//
//        if (searchTerm.equals("") || searchTerm.toLowerCase().equals("all")) {
//            jobs = JobData.findAll();
//            model.addAttribute("title", "All Jobs");
//        } else {
//            jobs = JobData.findByColumnAndValue(searchType, searchTerm);
//            model.addAttribute("title", "Jobs with " + columnChoices.get(searchType) + ": " + searchTerm);
//            model.addAttribute("searchType", searchType);
//            model.addAttribute("searchTerm", searchTerm);
//        }
//        model.addAttribute("jobs", jobs);
//        model.addAttribute("columns", columnChoices);

        return "results";
    }

}