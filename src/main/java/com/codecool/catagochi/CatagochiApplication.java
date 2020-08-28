package com.codecool.catagochi;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.entity.Owner;
import com.codecool.catagochi.model.Age;
import com.codecool.catagochi.model.Gender;
import com.codecool.catagochi.repository.CatRepository;
import com.codecool.catagochi.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableScheduling
public class CatagochiApplication {

    @Autowired
    private CatRepository catRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(CatagochiApplication.class, args);
    }

    @Bean
    @Profile("production")
    @PostConstruct
    public void init() {
            Owner user = ownerRepository.saveAndFlush(Owner.builder()
                    .username("user")
                    .password("pw")
                    .build());

            Cat jonesy = Cat.builder()
                    .name("Jonesy")
                    .gender(Gender.MALE)
                    .age(Age.ADULT)
                    .img("https://d2ph5fj80uercy.cloudfront.net/04/cat2972.jpg")
                    .owner(user)
                    .build();
            catRepository.save(jonesy);


            catRepository.save(Cat.builder()
                    .name("Schrödinger")
                    .gender(Gender.MALE)
                    .age(Age.YOUNG)
                    .img("https://d2ph5fj80uercy.cloudfront.net/06/cat1996.jpg")
                    .build());

            catRepository.save(Cat.builder()
                    .name("Ópamacs")
                    .gender(Gender.MALE)
                    .age(Age.ADULT)
                    .img("https://d2ph5fj80uercy.cloudfront.net/06/cat2630.jpg")
                    .build());

            catRepository.save(Cat.builder()
                    .name("Guriga")
                    .gender(Gender.FEMALE)
                    .age(Age.ADULT)
                    .img("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQDUBhnLKerrtsNVx1l-QiaPrnJfG5zNFY-O5F_Xc9XNNJgukrj&usqp=CAU")
                    .build());

            catRepository.save(Cat.builder()
                    .name("Lukrécia")
                    .gender(Gender.FEMALE)
                    .age(Age.ADULT)
                    .img("https://www.stylist.co.uk/images/app/uploads/2018/10/11175734/kazuky-akayashi-703909-unsplash-256x256.jpg?w=256&h=256&fit=max&auto=format%2Ccompress")
                    .build());
    }
}
