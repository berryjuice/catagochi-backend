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
        cat.setLitterboxClean(false);
    }

    public Cat findCatById(int id) throws Exception {
        return catStorage.getAllCats().stream()
                .filter(c->c.getId()==id)
                .findFirst()
                .orElseThrow(()->new Exception("You have not adopted any cat with id: "+id));
    }

    public Cat giveFood(int id) throws Exception {
        Cat cat = findCatById(id);
        cat.setHungry(false);
        return cat;
    }

    public Cat renameCatById(int id, String newName) throws Exception {
        Cat cat = findCatById(id);
        cat.setName(newName);
        return cat;
    }
}
