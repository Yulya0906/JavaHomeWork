package com.pb.grigoreva.hw6;

public class Animal {

    private String food;
    private String location;
    private String name;

    public Animal (String name) {
        this.food = food;
        this.location = location;
        this.name=name;

    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String location) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println(" Это животное шумит");
    }

    public void eat() {
        System.out.println(" Это животное кушает");
    }

    public void sleep() {
        System.out.println(" Это животное спит");
    }
}
