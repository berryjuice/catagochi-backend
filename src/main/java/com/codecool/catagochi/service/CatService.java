package com.codecool.catagochi.service;

import com.codecool.catagochi.entity.Cat;

import java.util.List;

public interface CatService {
    List<Cat> listAll();

    Cat getById(Long id) throws Exception;

    Cat saveOrUpdate(Cat cat);

    void resetPropertiesAtMidnight();
}
