package com.codecool.catagochi.model;

public enum Breed {
    UNKNOWN("unknown"),
    RUSSIANBLUE("Russian blue"),
    PERSIAN("Persian");

    private String breed;
    Breed(String breed) {
        this.breed = breed;
    }
}
