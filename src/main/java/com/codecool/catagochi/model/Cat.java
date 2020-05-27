package com.codecool.catagochi.model;

public class Cat{
   private int id;
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