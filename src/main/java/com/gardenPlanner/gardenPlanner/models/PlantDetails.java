package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class PlantDetails extends AbstractEntity {

    @OneToOne(mappedBy = "plantDetails")
    private Plant plant;

    @NotBlank(message = "Description is required!")
    @Size(min = 3, max = 500, message = "Description should be between 3 and 500 characters.")
    private String description;

    @NotBlank(message = "Scientific name is required!")
    @Size(min = 3, max = 80, message = "Scientific name should be between 3 and 80 characters.")
    private String scientificName;

    @NotBlank(message = "Flower colors are required!")
    @Size(min = 3, max = 100, message = "Flower colors should be between 3 and 100 characters.")
    private String flowerColors;

    private PlantType plantType;

    private boolean isEdible;

    @NotBlank(message = "Water tolerance is required!")
    @Size(min = 3, max = 50, message = "Water tolerance should be between 3 and 50 characters.")
    private String waterTolerance;

    @NotNull(message = "Days to Harvest is required!")
    private int daysToHarvest;

    @NotBlank(message = "Variety is required!")
    @Size(min = 3, max = 50, message = " should be between 3 and 50 characters.")
    private String variety;

    @NotBlank(message = "Planting Notes are required!")
    @Size(min = 3, max = 50, message = " should be between 3 and 50 characters.")
    private String plantingNotes;

    @NotBlank(message = "Shade tolerance is required!")
    @Size(min = 3, max = 50, message = "Shade tolerance should be between 3 and 50 characters.")
    private String shadeTolerance;

    @NotBlank(message = "Ph range is required!")
    @Size(min = 1, max = 5, message = "Ph range must be between 1 and 5 characters")
    private String phRange;

    public PlantDetails(Plant plant, String description, String scientificName, String flowerColors, PlantType plantType, boolean isEdible, String waterTolerance, int daysToHarvest, String variety, String plantingNotes, String shadeTolerance, String phRange) {
        this.plant = plant;
        this.description = description;
        this.scientificName = scientificName;
        this.flowerColors = flowerColors;
        this.plantType = plantType;
        this.isEdible = isEdible;
        this.waterTolerance = waterTolerance;
        this.daysToHarvest = daysToHarvest;
        this.variety = variety;
        this.plantingNotes = plantingNotes;
        this.shadeTolerance = shadeTolerance;
        this.phRange = phRange;
    }

    public PlantDetails() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getFlowerColors() {
        return flowerColors;
    }

    public void setFlowerColors(String flowerColors) {
        this.flowerColors = flowerColors;
    }

    public PlantType getPlantType() {
        return plantType;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }

    public boolean getIsEdible() {
        return isEdible;
    }

    public void setIsEdible(boolean isEdible) {
        this.isEdible = isEdible;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public int getDaysToHarvest() {
        return daysToHarvest;
    }

    public void setDaysToHarvest(int daysToHarvest) {
        this.daysToHarvest = daysToHarvest;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getPlantingNotes() {
        return plantingNotes;
    }

    public void setPlantingNotes(String plantingNotes) {
        this.plantingNotes = plantingNotes;
    }

    public String getWaterTolerance() {
        return waterTolerance;
    }

    public void setWaterTolerance(String waterTolerance) {
        this.waterTolerance = waterTolerance;
    }

    public String getShadeTolerance() {
        return shadeTolerance;
    }

    public void setShadeTolerance(String shadeTolerance) {
        this.shadeTolerance = shadeTolerance;
    }

    public String getPhRange() {
        return phRange;
    }

    public void setPhRange(String phRange) {
        this.phRange = phRange;
    }
}
