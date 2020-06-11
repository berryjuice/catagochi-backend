package com.codecool.catagochi.service;

import com.codecool.catagochi.entity.Cat;

import java.util.List;

public interface CatService {
    List<Cat> listAllCat();

    List<Cat> listAllAdoptableCat();

    List<Cat> listMyCats();

    Cat findMyCatById(Long id);

    Cat findAnyCatById(Long id);

    Cat giveFood(Long id);

    Cat giveDrink(Long id);

    Cat cleanLitterBox(Long id);

    Cat adoptCatById(Long id);

    Cat renameMyCatById(Long id, String newName) throws Exception;

    List<String> listAllMyCatsNames();

    void resetProperties();

    //Cat saveOrUpdate(Cat cat);
}
