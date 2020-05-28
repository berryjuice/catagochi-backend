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

    public void giveFood(int id) throws Exception {
        Cat foundCat = catStorage.getCats().stream()
                .filter(c -> c.getId()==id)
                .findFirst()
                .orElseThrow(() -> new Exception("You have not adopted any cat with id: "+id));

        foundCat.setHungry(false);
    }

    public Cat getCatDetails(int id) throws Exception {
        return catStorage.getCats().stream()
                .filter(c -> c.getId()==id)
                .findFirst()
                .orElseThrow(()->new Exception("You have not adopted any cat with id: "+id));
    }
}
