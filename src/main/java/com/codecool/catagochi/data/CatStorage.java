package com.codecool.catagochi.data;

import com.codecool.catagochi.model.Cat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatStorage {
    private List<Cat> allCats = new ArrayList<>();

    private void generateCats() {
        allCats.add(new Cat(0, "Jonesy", "male"));
        allCats.add(new Cat(1, "Schrödinger", "male"));
        allCats.add(new Cat(2, "Ópamacs", "male"));
    }

    public CatStorage() {
        generateCats();
    }

    public List<Cat> getAllCats() {
        return allCats;
    }

}
