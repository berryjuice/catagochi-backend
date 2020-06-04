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

    @GetMapping("/my-cats/{id}/give-drink")
    public Cat giveDrink(@PathVariable("id") int id) throws Exception {
        return catService.giveDrink(id);
    }

    @GetMapping("/my-cats/{id}/clean-litterbox")
    public Cat cleanLitterBox(@PathVariable("id") int id) throws Exception {
        return catService.cleanLitterBox(id);
    }

    @PostMapping("/my-cats/{id}/rename")
    public Cat renameCatById(@PathVariable("id") int id, @RequestBody String newName) throws Exception {
        return catService.renameCatById(id, newName);
    }
}

