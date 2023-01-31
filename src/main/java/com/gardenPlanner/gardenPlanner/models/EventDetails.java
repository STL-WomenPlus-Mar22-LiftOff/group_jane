package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity {

    @OneToOne(mappedBy = "eventDetails")
    private Event event;

    @NotBlank (message = "Description is required!")
    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank (message = "Year cannot be left blank!")
    @Size (min = 3, max = 20, message = "Month must be between 3 and 20 characters long!")
    private String date;


    private EventType type;

    public EventDetails(@Size(max = 500, message = "Description too long!")String description, @Size(min = 3, max = 9, message = "Month must be between 3 and 9 characters long!") String date, EventType eventTypeEnum) {
        this.description = description;
        this.date = date;
        this.type = eventTypeEnum;
    }

    public EventDetails() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }
}
