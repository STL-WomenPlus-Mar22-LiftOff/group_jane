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
        model.addAttribute("title", "All Types");
        model.addAttribute("types", eventTypeRepository.findAll());
        return "eventTypes/index";
    }

    @GetMapping("create")
    public String renderCreateEventTypeForm(Model model) {
        model.addAttribute("title", "Create An Event Type");
        model.addAttribute(new EventType());
        return "eventTypes/create";
    }

    @PostMapping("create")
    public String processCreateEventTypeForm(@Valid @ModelAttribute EventType eventType,
                                                 Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Event Type");
            model.addAttribute(new EventType());
            return "eventTypes/create";
        }

        eventTypeRepository.save(eventType);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteEventTypesForm(Model model) {
        model.addAttribute("title", "Delete Event Types");
        model.addAttribute("eventTypes", eventTypeRepository.findAll());
        return "eventTypes/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventTypesForm(@RequestParam(required = false) int[] eventIds) {

        if (eventIds != null) {
            for (int id : eventIds) {
                eventTypeRepository.deleteById(id);
            }
        }

        return "redirect:";

    }
}
