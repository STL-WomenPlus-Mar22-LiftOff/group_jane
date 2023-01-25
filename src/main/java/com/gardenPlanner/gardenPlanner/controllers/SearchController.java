package com.gardenPlanner.gardenPlanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("search/plantsearch")
public class SearchController {

//    public SearchController() {
//    }

    @GetMapping("")
    public String search() {

        return "search/plantsearch";
    }

//    @PostMapping("/search/plant-search/results")
//    public String displaySearchResults(Model model, @RequestParam String searchTerm, @RequestParam String searchType) {
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

//        return "/search/plant-search/results";
//    }

}