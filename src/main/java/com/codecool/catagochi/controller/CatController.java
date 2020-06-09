package com.codecool.catagochi.controller;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.data.CatStorage;
import com.codecool.catagochi.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CatController {

    @Autowired
    private CatStorage catStorage;

    @Autowired
    private CatService catService;

    @GetMapping("/")
    public List<Cat> catList() {
        return catStorage.getAllCats();
    }

    @GetMapping("/{id}")
    public Cat getCatDetails(@PathVariable("id") int id) throws Exception {
        return catService.findCatById(id);
    }

    @GetMapping("/my-cats")
    public List<Cat> adoptedCatList() {
        return catStorage.getMyCats();
    }

    @GetMapping("/my-cats/{id}")
    public Cat getMyCatDetails(@PathVariable("id") int id) throws Exception {
        return catService.findMyCatById(id);
    }

    @GetMapping("/my-cats/{id}/give-food")
    public Cat giveFood(@PathVariable("id") int id) throws Exception {
        return catService.changeState(id, "food");
    }

    @GetMapping("/my-cats/{id}/give-drink")
    public Cat giveDrink(@PathVariable("id") int id) throws Exception {
        return catService.changeState(id, "drink");
    }

    @GetMapping("/my-cats/{id}/clean-litterbox")
    public Cat cleanLitterBox(@PathVariable("id") int id) throws Exception {
        return catService.changeState(id, "litterbox");
    }

    @PutMapping("/my-cats/{id}/rename")
    public Cat renameCatById(@PathVariable("id") int id, @RequestBody @Nullable String newName) throws Exception {
        return catService.renameCatById(id, newName);
    }

    @GetMapping("/{id}/adopt")
    public Cat adopt(@PathVariable("id") int id) throws Exception {
        return catService.adopt(id);
    }
}

