package com.codecool.catagochi;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.model.Age;
import com.codecool.catagochi.repository.CatRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class RepositoryTests {
    @Autowired
    private CatRepository catRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void saveOneSimple() {
        catRepository.save(Cat.builder().build());
        assertThat(catRepository.listAllCat()).hasSize(1);
    }

    @Test
    public void defaultNameIsGivenWhenNameIsNull() {
        catRepository.save(Cat.builder().build());
        Assertions.assertEquals("Anonymus", catRepository.findCatById(1L).getName());
    }

    @Test
    public void newlyAddedCatIsNotAdopted() {
        catRepository.save(Cat.builder().build());
        Assertions.assertFalse(catRepository.findById(1L).get().isAdopted());
    }

    @Test
    public void adoption() {
        catRepository.save(Cat.builder().build());
        catRepository.save(Cat.builder().build());
        assertThat(catRepository.adoptCatById(1L)).isEqualTo(1);
    }

    @Test
    public void listMyCatsOnly() {
            catRepository.save(Cat.builder().build());
            catRepository.save(Cat.builder().build());
            catRepository.adoptCatById(1L);
            assertThat(catRepository.listMyCats()).hasSize(1);
    }

    @Test
    public void listAllCat() {
        Cat cat1 = Cat.builder()
                .name("Cat1")
                .adopted(true)
                .build();

        Cat cat2 = Cat.builder()
                .name("Cat2")
                .build();

        catRepository.save(cat1);
        catRepository.save(cat2);

        assertThat(catRepository.listAllCat()).hasSize(2);
    }

    @Test
    public void listAllAdoptableCat() {
        Cat cat1 = Cat.builder()
                .name("Cat1")
                .adopted(true)
                .build();

        Cat cat2 = Cat.builder()
                .name("Cat2")
                .build();

        catRepository.save(cat1);
        catRepository.save(cat2);

        assertThat(catRepository.listAllAdoptableCat()).hasSize(1);
    }

    @Test
    public void renameMyCatById() {
        catRepository.save(Cat.builder().build());
        catRepository.adoptCatById(1L);
        int i = catRepository.renameMyCatById(1L, "newname");
        Assertions.assertEquals(1, i);
    }

    @Test
    public void renameACatToANameThatAlreadyAdopted() {
        Cat cat1 = Cat.builder()
                .name("Cat1")
                .age(Age.ADULT)
                .build();

        Cat cat2 = Cat.builder()
                .name("Cat2")
                .age(Age.KITTEN)
                .build();

        catRepository.save(cat1);
        catRepository.save(cat2);

        catRepository.adoptCatById(1L);
        catRepository.adoptCatById(2L);

        catRepository.renameMyCatById(1L, "Cat2");

        assertThat(catRepository.findMyCatById(1L).getName()).isEqualTo("Cat1");
    }

}
