package com.codecool.catagochi.model;

import org.springframework.context.annotation.Bean;

public class Cat{
   private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    private String name;
   private String gender;

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "gender=" + gender +
                '}';
    }

    public Cat(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Cat() {}
}