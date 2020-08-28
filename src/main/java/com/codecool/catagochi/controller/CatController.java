package com.codecool.catagochi.controller;

import com.codecool.catagochi.entity.Cat;
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
    private CatService catService;

//    @GetMapping("/")
//    public ResponseEntity<?> listAllCats() {
//        try {
//            return ResponseEntity.ok().body(catServiceImpl.listAllAdoptableCat());
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body("Bad request");
//        }
//    }

    @GetMapping("/")
    public List<Cat> listAllAdoptableCats() {
        return catService.listAllAdoptableCat();
    }

    @GetMapping("/{id}")
    public Cat getCatDetails(@PathVariable("id") Long id) throws Exception {
        return catService.findAnyCatById(id);
    }

    @GetMapping("/{id}/adopt")
    public Cat adoptCatById(@PathVariable("id") Long id) throws Exception {
        return catService.adoptCatById(id);
    }

    @GetMapping("/my-cats")
    public List<Cat> adoptedCatList() {
        return catService.listMyCats();
    }

    @GetMapping("/my-cats/{id}")
    public Cat getMyCatDetails(@PathVariable("id") Long id) throws Exception {
        return catService.findMyCatById(id);
    }

    @GetMapping("/my-cats/{id}/give-food")
    public Cat giveFood(@PathVariable("id") Long id) {
        return catService.giveFood(id);
    }

    @GetMapping("/my-cats/{id}/give-drink")
    public Cat giveDrink(@PathVariable("id") Long id) throws Exception {
        return catService.giveDrink(id);
    }

    @GetMapping("/my-cats/{id}/clean-litterbox")
    public Cat cleanLitterBox(@PathVariable("id") Long id) throws Exception {
        return catService.cleanLitterBox(id);
    }

    @PutMapping("/my-cats/{id}/rename")
    public Cat renameMyCatById(@PathVariable("id") Long id, @RequestBody @Nullable String newName) throws Exception {
        return catService.renameMyCatById(id, newName);
    }

//    @PostMapping("/login")
//    public void login(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
//        return catServiceImpl.renameMyCatById(id, newName);
//    }
}

