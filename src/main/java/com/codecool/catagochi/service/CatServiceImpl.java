package com.codecool.catagochi.service;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component(value="catImpl")
public class CatServiceImpl implements CatService {

//    // Time-triggered event
//    // At midnight all working fields get reset
//    public void resetProperties(Cat cat) {
//        cat.setHungry(true);
//        cat.setThirsty(true);
//        cat.setLitterBoxClean(false);
//    }
//
//    public Cat changeState(Long id, String state) throws Exception {
//        Cat cat = getById(id);
//        switch(state) {
//            case "food":
//                cat.setHungry(false);
//                break;
//            case "drink":
//                cat.setThirsty(false);
//                break;
//            case "litterbox":
//                cat.setLitterBoxClean(true);
//                break;
//            default:
//        }
//        return cat;
//    }

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
        try {
            return catRepository.findCatById(id);
        } catch (Exception e) {
            throw new Exception("There is no cat with id: " + id);
        }
    }

    @Override
    public Cat saveOrUpdate(Cat cat) {
        catRepository.save(cat);
        return cat;
    }

    // Time-triggered event
    // At midnight all day-dependent properties are set to their morning values
    @Override
    public void resetPropertiesAtMidnight() {
        List<Cat> myCats = catRepository.findAllAdoptedCat();
        for (Cat cat : myCats) {
            cat.setHungry(true);
            cat.setThirsty(true);
            cat.setLitterBoxClean(false);
        }
    }


}
