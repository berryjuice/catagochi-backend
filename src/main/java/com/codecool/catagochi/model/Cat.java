package com.codecool.catagochi.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Cat {
    // Basic Fields
    private static int catCounter = 0;
    private @Setter(AccessLevel.PRIVATE) int id = catCounter++;
    private String name;
    private @Setter(AccessLevel.PRIVATE) Gender gender;
    private @Setter(AccessLevel.PRIVATE) Age age;
    private String img;

    // Working fields
    private boolean isHungry = true;
    private boolean isThirsty = true;
    private boolean isLitterBoxClean = true;

    // Constructor
    public Cat(String name, Gender gender, Age age, String img) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.img = img;
    }
}