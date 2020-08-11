package com.codecool.catagochi.controller;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.entity.Owner;
import com.codecool.catagochi.service.CatService;
import com.codecool.catagochi.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class OwnerController {
    @Autowired
    @Qualifier("ownerImpl")
    private OwnerService ownerServiceImpl;

    @GetMapping("/users")
    public List<Owner> listAllOwner() {
        return ownerServiceImpl.listAllOwner();
    }
}
