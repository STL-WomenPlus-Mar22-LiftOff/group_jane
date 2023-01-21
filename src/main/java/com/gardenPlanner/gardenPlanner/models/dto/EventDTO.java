package com.gardenPlanner.gardenPlanner.models.dto;

import com.gardenPlanner.gardenPlanner.models.Event;

import javax.validation.constraints.NotNull;

public class EventDTO {

    @NotNull
    private Event event;

    public EventDTO() {}

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

}
