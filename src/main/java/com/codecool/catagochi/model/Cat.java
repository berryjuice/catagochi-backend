package com.codecool.catagochi.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter @NoArgsConstructor
public class Cat {
    // Basic Fields
    private @Setter(AccessLevel.PRIVATE) int id;
    private String name;
    private @Setter(AccessLevel.PRIVATE) Gender gender;
    private @Setter(AccessLevel.PRIVATE) Age age;
    private String img;

    // Working fields
    private boolean isHungry;
    private boolean isThirsty;
    private boolean isLitterboxClean;

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