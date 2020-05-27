package com.codecool.catagochi.controller;

import com.codecool.catagochi.model.Cat;
import com.codecool.catagochi.data.CatStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {

    @Autowired
    private CatStorage catStorage;

    @GetMapping("/my-cats")
    public List<Cat> catList() {
        return catStorage.getAllCats();
    }
}
