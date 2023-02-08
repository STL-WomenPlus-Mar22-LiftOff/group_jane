package com.gardenPlanner.gardenPlanner.controllers;

import com.gardenPlanner.gardenPlanner.data.PlantRepository;
import com.gardenPlanner.gardenPlanner.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping(value = "list")
public class PlantController {

    @Autowired
    private PlantRepository plantRepository;

    @GetMapping("")
    public String displayAllPlants(Model model) {
        model.addAttribute("title", "All Plants");
        model.addAttribute("plants", plantRepository.findAll());
        return "list/index";
    }

    @GetMapping("add")
    public String displayAddPlantForm(Model model) {
        model.addAttribute("title", "Add Plant");
        model.addAttribute(new Plant());
        model.addAttribute("plantTypes", PlantType.values());
        return "list/add";
    }

    @PostMapping("add")
    public String processAddPlantForm(@ModelAttribute @Valid Plant plant,
                                         Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Add Plant");
            model.addAttribute("plant", plant);
            return "list/add";
        }
        model.addAttribute("plant", plant);
        plantRepository.save(plant);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeletePlantsForm(Model model) {
        model.addAttribute("title", "Delete Plants");
        model.addAttribute("plants", plantRepository.findAll());
        return "list/delete";
    }

    @PostMapping("delete")
    public String processDeletePlantsForm(@RequestParam(required = false) int[] plantIds) {

        if (plantIds != null) {
            for (int id : plantIds) {
                plantRepository.deleteById(id);
            }
        }

        return "redirect:";
    }

    @GetMapping("detail")
    public String displayPlantDetails(@RequestParam Integer plantId, Model model) {

        Optional<Plant> result = plantRepository.findById(plantId);

        if (result.isEmpty()) {
            model.addAttribute("title", "Invalid Plant ID: " + plantId);
        } else {
            Plant plant = result.get();
            model.addAttribute("title", plant.getCommonName() + " Details");
            model.addAttribute("plant", plant);
        }

        return "list/detail";
    }

    @GetMapping("ph")
    public String displayByFilteredpH(Model model) {
        model.addAttribute("title", "Filter by pH");
        model.addAttribute("plants", plantRepository.findAll());
        return "list/ph";
    }

    @PostMapping("ph")
    public String showpH() {

            return "list/ph";
    }

}