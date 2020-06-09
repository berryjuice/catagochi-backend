package com.codecool.catagochi.service;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component(value="catImpl")
public class CatServiceImpl implements CatService {

    // Time-triggered event
    // At midnight all working fields get reset
    public void resetProperties(Cat cat) {
        cat.setHungry(true);
        cat.setThirsty(true);
        cat.setLitterBoxClean(false);
    }

    public Cat changeState(Long id, String state) throws Exception {
        Cat cat = getById(id);
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

    public Cat renameCatById(Long id, String newName) throws Exception {
        Cat catById = getById(id);
        Cat catByName = getByName(newName);
        if (catById == null) {
            throw new Exception("You do not have a cat with id: " + id);
        }
        if (catByName == null) {
            catById.setName(newName);
            saveOrUpdate(catById);
            return catById;
        }
        else throw new Exception("You already have a cat with name: " + newName);
    }

    private Cat getByName(String newName) throws Exception {
        return listAll().stream()
                .filter(cat -> cat.getName().equals(newName))
                .findFirst()
                .orElseThrow(()->new Exception("You have not adopted any cat with name: " + newName));
        }

    // *******************************************************************

    @Autowired
    private CatRepository catRepository;

    @Override
    public List<Cat> listAll() {
        List<Cat> cats = new ArrayList<>();
        catRepository.findAll().forEach(cats::add);
        return cats;
    }

    @Override
    public Cat getById(Long id) throws Exception {
        return listAll().stream()
                .filter(cat -> cat.getId() == id)
                .findFirst()
                .orElseThrow(()->new Exception("There is no cat with id: " + id));
    }

    @Override
    public Cat saveOrUpdate(Cat cat) {
        catRepository.save(cat);
        return cat;
    }

    @Override
    public void delete(Long id) {

    }
}
