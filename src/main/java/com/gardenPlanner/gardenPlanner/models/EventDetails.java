package com.gardenPlanner.gardenPlanner.models;

import com.gardenPlanner.gardenPlanner.models.dto.AbstractEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity {

    @NotBlank (message = "Description is required!")
    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank (message = "Month cannot be left blank!")
    @Size (min = 3, max = 9, message = "Month must be between 3 and 9 characters long!")
    private String month;

    @NotBlank (message = "Day cannot be left blank!")
    @Size (min = 1, max = 3, message = "Day must be between 1 and 3 characters!")
    private String day;

    @NotBlank (message = "Year cannot be left blank!")
    @Size (min = 4, max = 4, message = "Year must be 4 characters long!")
    private String year;

    private String date;

    public EventDetails(@Size(max = 500, message = "Description too long!")String description, @Size(min = 3, max = 9, message = "Month must be between 3 and 9 characters long!") String month, @Size (min = 1, max = 3, message = "Day must be between 1 and 3 characters!")String day, @Size (min = 4, max = 4, message = "Year must be 4 characters long!")String year) {
        this.description = description;
        this.month = month;
        this.day = day;
        this.year = year;
        this.date = month + " " + day + ", " + year;
    }

    public EventDetails() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
