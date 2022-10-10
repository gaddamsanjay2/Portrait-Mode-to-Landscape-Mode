package com.firstapp.portrait_mode_to_landscape_mode;

public class DataModel {
    String location,equipment,workcenter,description;

    public DataModel(String location, String equipment, String workcenter, String description) {
        this.location = location;
        this.equipment = equipment;
        this.workcenter = workcenter;
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getWorkcenter() {
        return workcenter;
    }

    public void setWorkcenter(String workcenter) {
        this.workcenter = workcenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
