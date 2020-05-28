package com.codecool.catagochi.data;

import com.codecool.catagochi.model.Cat;
import com.codecool.catagochi.model.Gender;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CatStorage {
    private Set<Cat> cats = new HashSet<>();

    private void generateCats() {
        cats.add(new Cat(0, "Jonesy", Gender.MALE,  "https://d2ph5fj80uercy.cloudfront.net/04/cat2972.jpg"));
        cats.add(new Cat(1, "Schrödinger", Gender.MALE, "https://d2ph5fj80uercy.cloudfront.net/06/cat1996.jpg"));
        cats.add(new Cat(2, "Ópamacs", Gender.MALE, "https://d2ph5fj80uercy.cloudfront.net/06/cat2630.jpg"));
    }

    public CatStorage() {
        System.out.println("CatStorage instance created");
        generateCats();
    }

    public Set<Cat> getCats() {
        return cats;
    }

    public void giveFood(int id, Cat cat) throws Exception {
        Cat foundCat = this.cats.stream()
                .filter(c -> c.getId()==id)
                .findFirst()
                .orElseThrow(() -> new Exception("You have not adopted any cat with id: "+id));

        foundCat.setHungry(false);
    }

}
