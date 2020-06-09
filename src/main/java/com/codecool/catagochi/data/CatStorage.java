package com.codecool.catagochi.data;

import com.codecool.catagochi.model.Age;
import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.model.Gender;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CatStorage {
    private ArrayList<Cat> cats = new ArrayList<>();

    private void generateCats() {
        cats.add(new Cat("Jonesy", Gender.MALE, Age.ADULT, "https://d2ph5fj80uercy.cloudfront.net/04/cat2972.jpg"));
        cats.add(new Cat("Schrödinger", Gender.MALE, Age.YOUNG, "https://d2ph5fj80uercy.cloudfront.net/06/cat1996.jpg"));
        cats.add(new Cat("Ópamacs", Gender.MALE, Age.ADULT, "https://d2ph5fj80uercy.cloudfront.net/06/cat2630.jpg"));
        cats.add(new Cat("Guriga", Gender.FEMALE, Age.ADULT, "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQDUBhnLKerrtsNVx1l-QiaPrnJfG5zNFY-O5F_Xc9XNNJgukrj&usqp=CAU"));
        cats.add(new Cat("Lukrécia", Gender.FEMALE, Age.ADULT, "https://www.stylist.co.uk/images/app/uploads/2018/10/11175734/kazuky-akayashi-703909-unsplash-256x256.jpg?w=256&h=256&fit=max&auto=format%2Ccompress"));
    }

    public CatStorage() {generateCats();}

    public List<Cat> getAllCats() {
        return cats.stream()
                .filter(c -> c.isAdopted() == false)
                .collect(Collectors.toList());
    }

    public List<Cat> getMyCats() {
        return cats.stream()
                .filter(c -> c.isAdopted() == true)
                .collect(Collectors.toList());
    }
}
