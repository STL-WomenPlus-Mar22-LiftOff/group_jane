package com.gardenPlanner.gardenPlanner.models;


import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class GardenArea extends AbstractEntity {

    @NotBlank(message="Field cannot be blank")
    private String ;

    @NotBlank(message="Field cannot be blank")
    private String ;

}
