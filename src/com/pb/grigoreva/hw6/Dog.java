package com.pb.grigoreva.hw6;

import java.util.Objects;

public class Dog extends  Animal{

    private String breed;
    private String color;
    private String wool;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(" Собака гавкает");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println(" Собака ест");
        super.eat();
    }

    @Override
    public String toString(){
        return "Dog {" + "name=" + getName() + '/' +
                ", food=" + getFood() +'/' +
                ", location=" + getLocation() +'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return color= dog.color && Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, color);
    }

}
