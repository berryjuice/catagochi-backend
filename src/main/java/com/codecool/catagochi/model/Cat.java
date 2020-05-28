package com.codecool.catagochi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@EnableScheduling
public class Cat{
    // Basic Fields
    private int id;
    private String name;
    private Gender gender;
    private Age age;
    private String img;

    // Working fields
    private boolean isHungry;
    private boolean isThirsty;
    private boolean isLitterboxClean;

    // Getters
    public int getId() {return id;}
    public String getName() {return name;}
    public Gender getGender() {return gender;}
    public Age getAge() {return age;}
    public String getImg() {return img;}
    public boolean getIsHungry() {return isHungry;}
    public boolean getIsThirsty() {return isThirsty;}
    public boolean getIsLitterboxClean() {return isLitterboxClean;}

    // Setters

    public void setHungry(boolean val) {this.isHungry = val;}
    public void setThirsty(boolean val) {this.isThirsty = val;}
    public void setLitterboxClean(boolean val) {this.isLitterboxClean = val;}

    // Constructors
    public Cat(int id, String name, Gender gender, Age age, String img) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.img = img;
        this.isHungry = true;
        this.isThirsty = true;
        this.isLitterboxClean = false;
    }
    public Cat() {}

}