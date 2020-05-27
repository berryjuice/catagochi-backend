package com.codecool.catagochi.service;

import com.codecool.catagochi.model.Cat;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class CatCreator {
    private List<Cat> allCats = new LinkedList<>();
    private List<Cat> generateCats() {
        allCats.add(new Cat(0, "Jonesy", "male"));
        allCats.add(new Cat(1, "Schrödinger", "male"));
        allCats.add(new Cat(2, "Ópamacs", "male"));
        return allCats;
    }

    public CatCreator() {
        generateCats();
    }

    public List<Cat> getAllCats() {
        return allCats;
    }

}
