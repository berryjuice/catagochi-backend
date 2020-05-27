package com.codecool.catagochi.config;

import com.codecool.catagochi.data.CatStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreatorConfig {
    @Bean
    public CatStorage createCatStorage() {
        return new CatStorage();
    }
}
