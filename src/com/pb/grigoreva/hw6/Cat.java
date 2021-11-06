package com.pb.grigoreva.hw6;

import java.util.Objects;

public class Cat extends  Animal{

    private String breed;
    private String color;
    private String wool;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("кот мяукает");
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println("кот ест");
        super.eat();
    }

    @Override
    public String toString(){
        return "Cat {" + "name=" + getName() + '/' +
                ", food=" + getFood() +'/' +
                ", location=" + getLocation() +'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return color= cat.color && Objects.equals(breed, cat.breed);
    }
}
