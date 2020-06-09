package com.codecool.catagochi;

import com.codecool.catagochi.data.CatStorage;
import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.service.CatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableScheduling
public class CatagochiApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CatagochiApplication.class);

    @Autowired
    private CatStorage catStorage;

    @Autowired
    private CatService catService;

    @Scheduled(cron="0 0 0 * * *")
    public void resetProperties() {
        for (Cat cat : catStorage.getAllCats()) {
            catService.resetProperties(cat);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(CatagochiApplication.class, args);
    }

    @PostConstruct
    public void afterInit() {
        LOGGER.info(catStorage.getAllCats().toString());
        LOGGER.info(catStorage.toString());

    }

}
