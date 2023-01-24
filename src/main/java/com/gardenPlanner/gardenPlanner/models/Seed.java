package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Seed extends AbstractEntity {

    @NotNull (message = "Days til harvest is required!")
    @NotBlank (message = "Days til harvest cannot be blank!")
    private int daysToHarvest;

    @NotNull
    @NotBlank (message = "Variety cannot be blank!")
    @Size(min = 3, max = 50, message = "Variety must be between 3 and 50 characters!")
    private String variety;

    @Size(max = 500, message = "Notes cannot exceed 500 characters!")
    private String notes;


}
