package com.codecool.catagochi.controller;

import com.codecool.catagochi.model.Cat;
import com.codecool.catagochi.data.CatStorage;
import com.codecool.catagochi.service.CatService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CatController {
    Gson gson = new Gson();

    @Autowired
    private CatStorage catStorage;

    @Autowired
    private CatService catService;

    @GetMapping("/my-cats")
    public String catList() {
        return gson.toJson(catStorage);
    }

    @GetMapping("/my-cats/{id}")
    public Cat catDetails(@PathVariable("id") int id) throws Exception {
        return catService.findCatById(id);
    }

    @GetMapping("/my-cats/{id}/give-food")
    public Cat giveFood(@PathVariable("id") int id) throws Exception {
        return catService.giveFood(id);
    }
}

