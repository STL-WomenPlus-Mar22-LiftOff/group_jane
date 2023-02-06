package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class GardenDetails extends AbstractEntity {

    @OneToOne(mappedBy = "gardenDetails")
    private Garden garden;

    private Zone zone;

    public GardenDetails(Garden garden, Zone zone) {
        this.garden = garden;
        this.zone = zone;
    }

    public GardenDetails() {
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
}

