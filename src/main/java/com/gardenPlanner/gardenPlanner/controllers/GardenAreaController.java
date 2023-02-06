package com.gardenPlanner.gardenPlanner.controllers;

import com.gardenPlanner.gardenPlanner.data.GardenAreaRepository;
import com.gardenPlanner.gardenPlanner.data.GardenRepository;
import com.gardenPlanner.gardenPlanner.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping(value="gardenArea")
public class GardenAreaController {

    @Autowired
    GardenAreaRepository gardenAreaRepository;

    @GetMapping("")
    public String displayAllGardenAreas(Model model) {
        model.addAttribute("title", "All Garden Areas");
        model.addAttribute("gardenAreas", gardenAreaRepository.findAll());
        return ("garden/index");
    }
    @GetMapping("add")
    public String displayAddGardenAreaForm(Model model) {
        model.addAttribute("title", "Add Garden Area");
        model.addAttribute(new GardenArea());
        model.addAttribute("bedTypes", BedType.values());
        model.addAttribute("soilTextures", SoilTexture.values());
        model.addAttribute("phValues", Ph.values());
        return "gardenArea/add";
    }

    @PostMapping("add")
    public String processAddGardenAreaForm(@ModelAttribute @Valid GardenArea gardenArea,
                                      Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Add Garden Area");
            model.addAttribute("gardenArea", gardenArea);
            return "gardenArea/add";
        }
        model.addAttribute("gardenArea", gardenArea);
        gardenAreaRepository.save(gardenArea);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteGardenAreaForm(Model model) {
        model.addAttribute("title", "Delete Garden Area(s)");
        model.addAttribute("gardenAreas", gardenAreaRepository.findAll());
        return "gardenArea/delete";
    }

    @PostMapping("delete")
    public String processDeleteGardenAreaForm(@RequestParam(required = false) int[] gardenAreaIds) {

        if (gardenAreaIds != null) {
            for (int id : gardenAreaIds) {
                gardenAreaRepository.deleteById(id);
            }
        }

        return "redirect:";
    }

    @GetMapping("detail")
    public String displayGardenAreaDetails(@RequestParam Integer gardenAreaId, Model model) {

        Optional<GardenArea> result = gardenAreaRepository.findById(gardenAreaId);

        if (result.isEmpty()) {
            model.addAttribute("title", "Invalid Garden Area ID: " + gardenAreaId);
        } else {
            GardenArea gardenArea = result.get();
            model.addAttribute("title", gardenArea.getName() + " Details");
            model.addAttribute("gardenArea", gardenArea);
        }

        return "gardenArea/detail";
    }

}
