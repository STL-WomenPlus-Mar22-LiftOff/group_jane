package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Event extends AbstractEntity {

    @NotBlank(message = "Label is required")
    @Size(min = 3, max = 50, message = "Label must be between 3 and 50 characters")
    private String label;

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private EventDetails eventDetails;

    @ManyToOne
    @NotNull(message = "Event Type is required")
    private EventType eventType;

    public Event(String label, EventType eventType) {
        this.label = label;
        this.eventType = eventType;
    }

    public Event() {}

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public EventType getEventCategory() {
        return eventType;
    }

    public void setEventCategory(EventType eventCategory) {
        this.eventType = eventCategory;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    //@Override
    public String toString() {
        return label;
    }

}
