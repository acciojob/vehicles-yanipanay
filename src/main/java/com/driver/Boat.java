package com.driver;

public class Boat implements WaterVehicle {

    private int capacity;

    private String name;
    public String getVehicleName(){
        return this.name;
    }
    public int getVehicleCapacity(){
        return this.capacity;
    }
}
