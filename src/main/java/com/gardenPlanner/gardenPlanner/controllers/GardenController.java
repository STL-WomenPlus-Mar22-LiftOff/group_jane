package com.gardenPlanner.gardenPlanner.controllers;

import com.gardenPlanner.gardenPlanner.data.GardenAreaRepository;
import com.gardenPlanner.gardenPlanner.data.GardenRepository;
import com.gardenPlanner.gardenPlanner.models.Garden;
import com.gardenPlanner.gardenPlanner.models.GardenArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping(value = "garden")
public class GardenController {

    @Autowired
    private GardenRepository gardenRepository;

    @Autowired
    private GardenAreaRepository gardenAreaRepository;

    @GetMapping("")
    public String displayGarden () {
        return "garden/index";
    }

    @GetMapping("detail")
    public String displayGardenAreaDetails(@RequestParam Integer gardenId, Model model) {

        Optional<Garden> result = gardenRepository.findById(gardenId);

        if (result.isEmpty()) {
            model.addAttribute("title", "Invalid Garden ID: " + gardenId);
        } else {
            Garden garden = result.get();
            model.addAttribute("title", garden.getName() + " Details");
            model.addAttribute("garden", garden);
        }

        return "garden/detail";
    }

}
