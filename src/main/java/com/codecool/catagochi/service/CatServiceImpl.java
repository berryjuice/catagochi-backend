package com.codecool.catagochi.service;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value="catImpl")
public class CatServiceImpl implements CatService {

    @Autowired
    private CatRepository catRepository;

    @Override
    public List<Cat> listAllCat() {
        return catRepository.listAllCat();
    }

    @Override
    public List<Cat> listAllAdoptableCat() {
        return catRepository.listAllAdoptableCat();
    }

    @Override
    public List<Cat> listMyCats() {
        return catRepository.listMyCats();
    }

    @Override
    public Cat findMyCatById(Long id) {
        return catRepository.findMyCatById(id);
    }

    @Override
    public Cat findAnyCatById(Long id) {
        return catRepository.findCatById(id);
    }

    @Override
    public Cat giveFood(Long id) {
        catRepository.giveFood(id);
        return catRepository.findMyCatById(id);
    }

    @Override
    public Cat giveDrink(Long id) {
        catRepository.giveDrink(id);
        return catRepository.findMyCatById(id);
    }

    @Override
    public Cat cleanLitterBox(Long id) {
        catRepository.cleanLitterBox(id);
        return catRepository.findMyCatById(id);
    }

    @Override
    public Cat adoptCatById(Long id) {
        catRepository.adoptCatById(id);
        return catRepository.findMyCatById(id);
    }

    @Override
    public List<String> listAllMyCatsNames() {
        return catRepository.listAllMyCatsName();
    }

    @Override
    public Cat renameMyCatById(Long id, String newName) throws Exception {
        if (newName == null) {
            return catRepository.findMyCatById(id);
        }
        List<String> names = catRepository.listAllMyCatsName();
        if (names.contains(newName)) {
            throw new Exception("You already have a cat with name: " + newName);
        }
        catRepository.renameMyCatById(id, newName);
        return catRepository.findMyCatById(id);
    }

    @Override
    public void resetProperties() {
        catRepository.resetProperties();
    }
}
