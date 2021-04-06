package com.ayush;

public class Car {
    private String LEADS = "freshsales-main-stg";
    private int doors;
    private int wheels;
    private long cost;
    private String model;

    public int getDoors() {
        return doors*2;
    }

    public void setDoors(int doors) {
        this.doors = doors+1;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    Car(int doors, int wheels, String model) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
    }
}
