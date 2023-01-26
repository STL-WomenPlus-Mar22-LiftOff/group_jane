package com.gardenPlanner.gardenPlanner.controllers;

import com.gardenPlanner.gardenPlanner.data.EventTypeRepository;
import com.gardenPlanner.gardenPlanner.models.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("eventTypes")
public class EventTypeController {

    @Autowired
    private EventTypeRepository eventTypeRepository;

    @GetMapping
    public String displayAllCategories(Model model) {
        model.addAttribute("title", "All Categories");
        model.addAttribute("categories", eventTypeRepository.findAll());
        return "eventType/index";
    }

    @GetMapping("create")
    public String renderCreateEventCategoryForm(Model model) {
        model.addAttribute("title", "Create Category");
        model.addAttribute(new EventType());
        return "eventType/create";
    }

    @PostMapping("create")
    public String processCreateEventCategoryForm(@Valid @ModelAttribute EventType eventCategory,
                                                 Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Event Type");
            model.addAttribute(new EventType());
            return "eventType/create";
        }

        eventTypeRepository.save(eventCategory);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Event Types");
        model.addAttribute("events", eventTypeRepository.findAll());
        return "eventType/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {

        if (eventIds != null) {
            for (int id : eventIds) {
                eventTypeRepository.deleteById(id);
            }
        }

        return "redirect:";

    }
}
