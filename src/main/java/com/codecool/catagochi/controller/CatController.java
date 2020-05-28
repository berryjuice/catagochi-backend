package com.codecool.catagochi.controller;

import com.codecool.catagochi.model.Cat;
import com.codecool.catagochi.data.CatStorage;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CatController {
    Gson gson = new Gson();

    @Autowired
    private CatStorage catStorage;

    @GetMapping("/my-cats")
    public String catList() {
        return gson.toJson(catStorage);
    }

    @GetMapping("/my-cats/{id}")
    public String catDetails(@PathVariable("id") int id) throws Exception {
        Cat cat = catStorage.getCats().stream()
                .filter(c -> c.getId()==id)
                .findFirst()
                .orElseThrow(()->new Exception("You have not adopted any cat with id: "+id));
        return gson.toJson(cat);
    }

    @GetMapping("/my-cats/{id}/give-food")
    public void giveFood(@PathVariable("id") int id) throws Exception {
        Cat cat = catStorage.getCats().stream()
                .filter(c -> c.getId()==id)
                .findFirst()
                .orElseThrow(()->new Exception("You have not adopted any cat with id: "+id));
        cat.setHungry(false);
    }

    @GetMapping("/my-cats/{id}/give-water")
    public void giveWater(@PathVariable("id") int id) throws Exception {
        Cat cat = catStorage.getCats().stream()
                .filter(c -> c.getId()==id)
                .findFirst()
                .orElseThrow(()->new Exception("You have not adopted any cat with id: "+id));
        cat.setThirsty(false);
    }

    @GetMapping("/my-cats/{id}/clean-litterbox")
    public void cleanLitterbox(@PathVariable("id") int id) throws Exception {
        Cat cat = catStorage.getCats().stream()
                .filter(c -> c.getId()==id)
                .findFirst()
                .orElseThrow(()->new Exception("You have not adopted any cat with id: "+id));
        cat.setLitterboxClean(true);
    }
}

