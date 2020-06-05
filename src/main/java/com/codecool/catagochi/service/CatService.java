package com.codecool.catagochi.service;

import com.codecool.catagochi.model.Cat;
import com.codecool.catagochi.data.CatStorage;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatService {
    @Autowired
    private CatStorage catStorage;

    // Time-triggered event
    // At midnight all working fields get reset
    public void resetProperties(Cat cat) {
        cat.setHungry(true);
        cat.setThirsty(true);
        cat.setLitterBoxClean(false);
    }

    public Cat findCatById(int id) throws Exception {
        return catStorage.getAllCats().stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow(()->new Exception("There is no cat with id: "+ id));
    }

    public Cat findMyCatById(int id) throws Exception {
        return catStorage.getMyCats().stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow(()->new Exception("You have not adopted any cat with id: "+ id));
    }

    public Cat findCatByName(String name) {
        return catStorage.getMyCats().stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Cat changeState(int id, String state) throws Exception {
        Cat cat = findMyCatById(id);
        switch(state) {
            case "food":
                cat.setHungry(false);
                break;
            case "drink":
                cat.setThirsty(false);
                break;
            case "litterbox":
                cat.setLitterBoxClean(true);
                break;
            default:
        }
        return cat;
    }

    public Cat renameCatById(int id, String newName) throws Exception {
        Cat catById = findMyCatById(id);
        Cat catByName = findCatByName(newName);
        if (catById == null) {
            throw new Exception("You do not have a cat with id: " + id);
        }
        if (catByName == null) {
            catById.setName(newName);
            return catById;
        }
        else throw new Exception("You already have a cat with name: " + newName);
    }

    public Cat adopt(int id) throws Exception {
        Cat cat = findCatById(id);
        if (cat == null) {
            throw new Exception("There is no cat with id: " + id);
        }
        else {
            cat.setAdopted(true);
            return cat;
        }
    }
}
