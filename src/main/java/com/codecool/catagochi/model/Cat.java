package com.codecool.catagochi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter @NoArgsConstructor
public class Cat {
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

//    // Getters
//    public int getId() {return id;}
//    public String getName() {return name;}
//    public Gender getGender() {return gender;}
//    public Age getAge() {return age;}
//    public String getImg() {return img;}
//    public boolean getIsHungry() {return isHungry;}
//    public boolean getIsThirsty() {return isThirsty;}
//    public boolean getIsLitterboxClean() {return isLitterboxClean;}
//
//    // Setters
//    public void setHungry(boolean val) {this.isHungry = val;}
//    public void setThirsty(boolean val) {this.isThirsty = val;}
//    public void setLitterboxClean(boolean val) {this.isLitterboxClean = val;}
//    public void setName(String name) { this.name = name;}

    // Constructor
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
}