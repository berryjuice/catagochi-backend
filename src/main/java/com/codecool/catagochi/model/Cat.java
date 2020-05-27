package com.codecool.catagochi.model;

public class Cat{
    // Basic Fields
    private int id;
    private String name;
    private Gender gender;
    private String img;

    // Working fields
    private boolean isHungry;
    private boolean isThirsty;
    private boolean hasPood;

    // Getters
    public int getId() {return id;}
    public String getName() {return name;}
    public Gender getGender() {return gender;}
    public String getImg() {return img;}
    public boolean isHungry() {return isHungry;}
    public boolean isThirsty() {return isThirsty;}
    public boolean isHasPood() {return hasPood;}

    // Setters

    public void setHungry(boolean val) {this.isHungry = val;}

    // custom toString
    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:" + name +
                ", gender:" + gender +
                ", image:" + img +
                ", isHungry:" + isHungry +
                ", isThirsty:" + isThirsty +
                ", hasPood: " + hasPood +
                '}';
    }

    // Constructors
    public Cat(int id, String name, Gender gender, String img) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.img = img;
        this.isHungry = true;
        this.isThirsty = true;
        this.hasPood = false;
    }
    public Cat() {}
}