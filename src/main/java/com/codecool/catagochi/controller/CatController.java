package com.codecool.catagochi.controller;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.repository.CatRepository;
import com.codecool.catagochi.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CatController {

    @Autowired
    @Qualifier("catImpl")
    private CatService catServiceImpl;

    @GetMapping("/")
    public List<Cat> listAllCats() {
        return catServiceImpl.listAllCat();
    }

    @GetMapping("/{id}")
    public Cat getCatDetails(@PathVariable("id") Long id) throws Exception {
        return catServiceImpl.findAnyCatById(id);
    }

    @GetMapping("/{id}/adopt")
    public Cat adoptCatById(@PathVariable("id") Long id) throws Exception {
        return catServiceImpl.adoptCatById(id);
    }

    @GetMapping("/my-cats")
    public List<Cat> adoptedCatList() {
        return catServiceImpl.listMyCats();
    }

    @GetMapping("/my-cats/{id}")
    public Cat getMyCatDetails(@PathVariable("id") Long id) throws Exception {
        return catServiceImpl.findMyCatById(id);
    }

    @GetMapping("/my-cats/{id}/give-food")
    public Cat giveFood(@PathVariable("id") Long id) {
        return catServiceImpl.giveFood(id);
    }

    @GetMapping("/my-cats/{id}/give-drink")
    public Cat giveDrink(@PathVariable("id") Long id) throws Exception {
        return catServiceImpl.giveDrink(id);
    }

    @GetMapping("/my-cats/{id}/clean-litterbox")
    public Cat cleanLitterBox(@PathVariable("id") Long id) throws Exception {
        return catServiceImpl.cleanLitterBox(id);
    }

    @PutMapping("/my-cats/{id}/rename")
    public Cat renameMyCatById(@PathVariable("id") Long id, @RequestBody @Nullable String newName) throws Exception {
        return catServiceImpl.renameMyCatById(id, newName);
    }
}

