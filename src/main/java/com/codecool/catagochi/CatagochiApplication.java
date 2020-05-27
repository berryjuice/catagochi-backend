package com.codecool.catagochi;

import com.codecool.catagochi.service.CatCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CatagochiApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CatagochiApplication.class);

    @Autowired
    private CatCreator catCreator;

    public static void main(String[] args) {
        SpringApplication.run(CatagochiApplication.class, args);
    }

    @PostConstruct
    public void afterInit() {
        LOGGER.info(catCreator.getAllCats().toString());
    }

}
