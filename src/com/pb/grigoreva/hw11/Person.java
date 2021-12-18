package com.pb.grigoreva.hw11;

import java.time.LocalDate;

public class Person {
    String name;
    String phone;


    // @ JsonDeserialize (с использованием = LocalDateDeserializer.class)
    // @ JsonSerialize (с использованием = LocalDateSerializer.class)
    private LocalDate dateOfBirth;

    public Person () {
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getPhone () {
        return phone;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfBirth () {
        return dateOfBirth;
    }

    public void setDateOfBirth (LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person (String name, String phone, LocalDate dateOfBirth) {
        this.name = name;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString () {
        return "Person {" + "name=" + getName() + '/' +
                ", phone=" + getPhone() +'/' +
                ",dateOfBirth=" + getDateOfBirth() +'}';

    }
}
