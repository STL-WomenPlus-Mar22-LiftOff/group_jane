package com.gardenPlanner.gardenPlanner.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity {

    @NotBlank (message = "Description is required!")
    @Size(max = 500, message = "Description too long!")
    private String description;

    public EventDetails(@Size(max = 500, message = "Description too long!") String description) {
        this.description = description;
    }

    public EventDetails() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
