package com.driver;

public class Boat implements WaterVehicle {

    private int capacity;

    private String name;

    public Boat(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }


    public String getVehicleName(){
        return this.name;
    }
    public int getVehicleCapacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setName(String name) {
        this.name = name;
    }
}
