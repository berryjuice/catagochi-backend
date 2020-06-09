package com.codecool.catagochi.entity;

import com.codecool.catagochi.model.Age;
import com.codecool.catagochi.model.Gender;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Cat {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private @Setter(AccessLevel.PRIVATE) Gender gender;
    private @Setter(AccessLevel.PRIVATE) Age age;
    private String img;

    // Working fields
    private boolean isHungry = true;
    private boolean isThirsty = true;
    private boolean isLitterBoxClean = true;
    private boolean isAdopted = false;

    // Constructor
    public Cat(String name, Gender gender, Age age, String img) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.img = img;
    }
}