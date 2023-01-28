package com.gardenPlanner.gardenPlanner.controllers;

import com.gardenPlanner.gardenPlanner.data.FlowerColorRepository;
import com.gardenPlanner.gardenPlanner.data.PlantTypeRepository;
import com.gardenPlanner.gardenPlanner.models.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping(value = "list")
public class ListController {

 @Autowired
  private FlowerColorRepository flowerColorRepository;

 @Autowired
  private PlantTypeRepository plantTypeRepository;

    static HashMap<String, String> columnChoices = new HashMap<>();
//    static HashMap<String, Object> tableChoices = new HashMap<>();
    private final Object PlantData;

   public ListController (Object plantData) {
     PlantData = plantData;
        columnChoices.put("all", "All");
        columnChoices.put("flowerColor", "Flower Color");
        columnChoices.put("plantType", "Plant Type");

//      tableChoices.put("all", "View All");
//      tableChoices.put("flowerColor", PlantData.getAllFlowerColors());
//      tableChoices.put("plantType", PlantData.getAllPlantTypes());

    }

    @GetMapping(value = "")
    public String list(Model model) {

       model.addAttribute("flowerColors", flowerColorRepository);
       model.addAttribute("plantTypes", plantTypeRepository);

        return "list";
    }

    @GetMapping(value = "plants")
    public String listPlantsByColumnAndValue(Model model, @RequestParam String column, @RequestParam(required = false) String value) {
        ArrayList<Plant> plants;
        if (column.equals("all")){
        //    plants = PlantData.findAll();
            model.addAttribute("title", "All Plants");
        } else {
//            plants = PlantData.findByColumnAndValue(column, value);
            model.addAttribute("title", "Plants with " + columnChoices.get(column) + ": " + value);
        }
        model.addAttribute("plants");

      return "list-plants";
 }

}
