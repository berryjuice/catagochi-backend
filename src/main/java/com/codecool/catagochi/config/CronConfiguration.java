package com.codecool.catagochi.config;

import com.codecool.catagochi.service.CatService;
import com.codecool.catagochi.service.CatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class CronConfiguration {

    @Autowired
    private CatService catService;

    /** This method sets the basic properties (hungry, thirsty, litterBoxClean) to their default values */
    @Scheduled(cron="0 0 0 * * *")
    void resetPropertiesAtMidnight() {
        catService.decreaseHappiness();
        catService.setHappinessToHappy();
        catService.resetProperties();
    }
}
