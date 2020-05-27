package com.codecool.catagochi.controller;

import com.codecool.catagochi.model.Cat;
import com.codecool.catagochi.data.CatStorage;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
