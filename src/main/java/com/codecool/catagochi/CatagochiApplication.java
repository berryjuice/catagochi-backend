package com.codecool.catagochi;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.model.Age;
import com.codecool.catagochi.model.Breed;
import com.codecool.catagochi.model.Gender;
import com.codecool.catagochi.repository.CatRepository;
import com.codecool.catagochi.service.CatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class CatagochiApplication {

    @Autowired
    private CatRepository catRepository;

    @Autowired
    private CatServiceImpl catServiceImpl;

    @Scheduled(cron="14 45 0 * * *")
    void resetPropertiesAtMidnight() {
        catServiceImpl.resetProperties();
    }

    public static void main(String[] args) {
        SpringApplication.run(CatagochiApplication.class, args);
    }

    @Bean
    @Profile("production")
    public CommandLineRunner init() {
        return args -> {
            Cat cat = Cat.builder()
                    .name("Jonesy")
                    .gender(Gender.MALE)
                    .age(Age.ADULT)
                    .img("image")
                    .breed(Breed.PERSIAN)
                    .build();
            catRepository.save(cat);

            Cat cat2 = Cat.builder()
                    .name("Maszat")
                    .gender(Gender.MALE)
                    .age(Age.ADULT)
                    .img("image")
                    .build();
            catRepository.save(cat2);

            Cat cat3 = Cat.builder()
                    .name("Guri")
                    .gender(Gender.MALE)
                    .age(Age.ADULT)
                    .breed(Breed.RUSSIANBLUE)
                    .img("image")
                    .build();
            catRepository.save(cat3);
        };
    }
}
