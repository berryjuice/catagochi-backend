package com.codecool.catagochi.service;

import com.codecool.catagochi.model.Cat;
import com.codecool.catagochi.data.CatStorage;
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
                .orElseThrow(()->new Exception("You have not adopted any cat with id: "+ id));
    }

    public Cat findCatByName(String name) throws Exception {
        return catStorage.getAllCats().stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                //.orElseThrow(()->new Exception("You do not have any cat with name: "+ name));
                .orElse(null);
    }

    public Cat giveFood(int id) throws Exception {
        Cat cat = findCatById(id);
        cat.setHungry(false);
        return cat;
    }

    public Cat renameCatById(int id, String newName) throws Exception {
        Cat catByName = findCatByName(newName);
        Cat catById = findCatById(id);
        if (catByName == null) {
            catById.setName(newName);
            //return catById;
        }
        return catById;
        //return null;
    }

    public Cat giveDrink(int id) throws Exception {
        Cat cat = findCatById(id);
        cat.setThirsty(false);
        return cat;
    }

    public Cat cleanLitterBox(int id) throws Exception {
        Cat cat = findCatById(id);
        cat.setLitterBoxClean(true);
        return cat;
    }
}
