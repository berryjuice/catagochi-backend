package com.codecool.catagochi.controller;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.repository.CatRepository;
import com.codecool.catagochi.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@CrossOrigin
public class CatController {

    @Autowired
    @Qualifier("catImpl")
    private CatService catServiceImpl;

    @Autowired
    private CatRepository catRepository;

    @GetMapping("/")
    public List<Cat> listAllCats() {
        return catServiceImpl.listAll();
    }

    @GetMapping("/{id}")
    public Cat getCatDetails(@PathVariable("id") Long id) throws Exception {
        return catServiceImpl.getById(id);
    }

    @GetMapping("/{id}/adopt")
    public Cat adoptCatById(@PathVariable("id") Long id) throws Exception {
        Cat cat = catServiceImpl.getById(id);
        cat.setAdopted(true);
        catServiceImpl.saveOrUpdate(cat);
        return cat;
    }


    @GetMapping("/my-cats")
    public List<Cat> adoptedCatList() {
        return catRepository.findAllAdoptedCat();
    }

    @GetMapping("/my-cats/{id}")
    public Cat getMyCatDetails(@PathVariable("id") Long id) throws Exception {
        return catRepository.findMyCatById(id);
    }

//    @GetMapping("/my-cats/{id}/give-food")
//    public Cat giveFood(@PathVariable("id") int id) throws Exception {
//        return catServiceImpl.changeState(id, "food");
//    }
//
//    @GetMapping("/my-cats/{id}/give-drink")
//    public Cat giveDrink(@PathVariable("id") int id) throws Exception {
//        return catServiceImpl.changeState(id, "drink");
//    }
//
//    @GetMapping("/my-cats/{id}/clean-litterbox")
//    public Cat cleanLitterBox(@PathVariable("id") int id) throws Exception {
//        return catServiceImpl.changeState(id, "litterbox");
//    }
}

