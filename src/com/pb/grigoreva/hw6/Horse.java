package com.pb.grigoreva.hw6;

import java.util.Objects;

public class Horse extends  Animal {

    private String breed;
    private String color;
    private String appointment;

    public Horse(String name) {
        super(name);
    }
    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
        super.eat();
    }
    @Override
    public String toString(){
        return "Horse {" + "name=" + getName() + '/' +
                ", food=" + getFood() +'/' +
                ", location=" + getLocation() +'}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return color= horse.color && Objects.equals(breed, horse.breed);
    }
}
