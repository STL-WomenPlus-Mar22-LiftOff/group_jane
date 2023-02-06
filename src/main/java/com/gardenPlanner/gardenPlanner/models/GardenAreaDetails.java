package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class GardenAreaDetails extends AbstractEntity {

    @OneToOne(mappedBy = "gardenAreaDetails")
    private GardenArea gardenArea;

    @NotNull
    private SoilTexture soilTexture;

    @NotNull
    private Ph ph;

    @NotNull
    private BedType bedType;

    @NotBlank(message = "Description is required!")
    @Size(min = 3, max = 500, message = "Description should be between 3 and 500 characters.")
    private String description;

    @NotBlank(message = "Notes are required!")
    @Size(min = 3, max = 500, message = "Notes should be between 3 and 500 characters.")
    private String notes;

    @NotNull (message = "")
    private String soilDepthInches;

    @NotNull (message = "")
    private String widthInches;

    @NotNull (message = "")
    private String lengthInches;

    @NotNull (message = "")
    private boolean isPerennial;

    @NotNull(message = "Shade is required")
    @Size(min = 1, max = 50, message = "Shade must be between 1 and 50 characters.")
    private String shade;

    private String gardenAreaDimensions = lengthInches + " Length x " + widthInches + " Width x " + soilDepthInches + " Depth";

    public GardenAreaDetails(GardenArea gardenArea, SoilTexture soilTexture, Ph ph, BedType bedType, String description, String notes, String shade, String soilDepthInches, String widthInches, String lengthInches, boolean isPerennial) {
        this.gardenArea = gardenArea;
        this.soilTexture = soilTexture;
        this.ph = ph;
        this.bedType = bedType;
        this.description=description;
        this.notes=notes;
        this.soilDepthInches = soilDepthInches;
        this.widthInches = widthInches;
        this.lengthInches = lengthInches;
        this.isPerennial = isPerennial;
        this.shade=shade;
    }

    public GardenArea getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(GardenArea gardenArea) {
        this.gardenArea = gardenArea;
    }

    public SoilTexture getSoilTexture() {
        return soilTexture;
    }

    public void setSoilTexture(SoilTexture soilTexture) {
        this.soilTexture = soilTexture;
    }

    public Ph getPh() {
        return ph;
    }

    public void setPh(Ph ph) {
        this.ph = ph;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSoilDepthInches() {
        return soilDepthInches;
    }

    public String getWidthInches() {
        return widthInches;
    }

    public String getLengthInches() {
        return lengthInches;
    }

    public boolean isPerennial() {
        return isPerennial;
    }

    public void setPerennial(boolean perennial) {
        isPerennial = perennial;
    }

    public String getGardenAreaDimensions() {
        return gardenAreaDimensions;
    }
}
