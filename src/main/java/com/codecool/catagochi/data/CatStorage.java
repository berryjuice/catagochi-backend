package com.codecool.catagochi.data;

import com.codecool.catagochi.model.Age;
import com.codecool.catagochi.model.Cat;
import com.codecool.catagochi.model.Gender;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CatStorage {
    private ArrayList<Cat> cats = new ArrayList<>();

    private void generateCats() {
        cats.add(new Cat(0, "Jonesy", Gender.MALE, Age.ADULT,  "https://d2ph5fj80uercy.cloudfront.net/04/cat2972.jpg"));
        cats.add(new Cat(1, "Schrödinger", Gender.MALE, Age.YOUNG, "https://d2ph5fj80uercy.cloudfront.net/06/cat1996.jpg"));
        cats.add(new Cat(2, "Ópamacs", Gender.MALE, Age.ADULT, "https://d2ph5fj80uercy.cloudfront.net/06/cat2630.jpg"));
        cats.add(new Cat(3, "Guriga", Gender.FEMALE, Age.ADULT, "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQDUBhnLKerrtsNVx1l-QiaPrnJfG5zNFY-O5F_Xc9XNNJgukrj&usqp=CAU"));
        cats.add(new Cat(4, "Lukrécia", Gender.FEMALE, Age.ADULT,"https://www.stylist.co.uk/images/app/uploads/2018/10/11175734/kazuky-akayashi-703909-unsplash-256x256.jpg?w=256&h=256&fit=max&auto=format%2Ccompress"));
    }

    public CatStorage() {
        generateCats();
    }

    public ArrayList<Cat> getAllCats() {
        return cats;
    }

}
