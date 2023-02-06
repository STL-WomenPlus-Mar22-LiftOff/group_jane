package com.gardenPlanner.gardenPlanner.controllers;

import com.gardenPlanner.gardenPlanner.data.EventRepository;
import com.gardenPlanner.gardenPlanner.models.Event;
//import com.gardenPlanner.gardenPlanner.models.EventType;
//import com.gardenPlanner.gardenPlanner.models.dto.EventDTO;
import com.gardenPlanner.gardenPlanner.models.EventDetails;
import com.gardenPlanner.gardenPlanner.models.EventType;
import com.gardenPlanner.gardenPlanner.models.dto.EventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

        @GetMapping
        public String displayAllEvents(Model model) {
            model.addAttribute("title", "All Events");
            model.addAttribute("events", eventRepository.findAll());
            return "events/index";
        }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        model.addAttribute(new Event());
        model.addAttribute("types", EventType.values());
        return "events/create";
        }

    @PostMapping("create")
    public String processCreateEventForm(@ModelAttribute @Valid Event newEvent,
                                         Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Event");
            return "events/create";
        }

        eventRepository.save(newEvent);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", eventRepository.findAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {

        if (eventIds != null) {
            for (int id : eventIds) {
                eventRepository.deleteById(id);
            }
        }

        return "redirect:";
    }

    @GetMapping("detail")
    public String displayEventDetails(@RequestParam Integer eventId, Model model) {

        Optional<Event> result = eventRepository.findById(eventId);

        if (result.isEmpty()) {
            model.addAttribute("title", "Invalid Event ID: " + eventId);
        } else {
            Event event = result.get();
            model.addAttribute("title", event.getLabel() + " Details");
            model.addAttribute("event", event);

        }

        return "events/detail";
    }

//    @GetMapping("edit/{eventId}")
//    public String displayEditForm(Model model, @PathVariable int eventId){
//
//        Optional<Event> eventToEdit = eventRepository.findById(eventId);
//
//        if (eventToEdit.isPresent()){
//        Event finalEvent = eventToEdit.get();
//
//        model.addAttribute("event", eventToEdit);
//        String title = "Edit Event " + finalEvent.getLabel() + " (id=" + eventId + ")";
//        model.addAttribute("title", title );
//        }
//        return "events/edit";
//    }
//
//    @PostMapping("edit")
//    public String processEditForm(Model model, int eventId, String label, String description, String date, EventType eventType) {
//
//        // takes in the optional event from the repository
//        Optional<Event> eventToEdit = eventRepository.findById(eventId);
//
//        //checks to make sure the event is there
//        if (eventToEdit.isPresent()) {
//
//            //converts optional event to Event form if present
//            Event finalEvent = eventToEdit.get();
//
//            finalEvent.setLabel(label);
//            finalEvent.setEventDetails(new EventDetails(description, date, eventType));
//
//            model.addAttribute("event", eventToEdit);
//
//
//            return "events/edit";
//        }
//        return "events/detail?{eventID}";
//    }

}
