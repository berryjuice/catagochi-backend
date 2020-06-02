package com.codecool.catagochi.controller;

import com.codecool.catagochi.model.Cat;
import com.codecool.catagochi.data.CatStorage;
import com.codecool.catagochi.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CatController {

    @Autowired
    private CatStorage catStorage;

    @Autowired
    private CatService catService;

    @GetMapping("/my-cats")
    public List<Cat> catList() {
        return catStorage.getAllCats();
    }

    @GetMapping("/my-cats/{id}")
    public Cat getCatDetails(@PathVariable("id") int id) throws Exception {
        return catService.findCatById(id);
    }

    @GetMapping("/my-cats/{id}/give-food")
    public Cat giveFood(@PathVariable("id") int id) throws Exception {
        return catService.giveFood(id);
    }
}

