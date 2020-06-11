package com.codecool.catagochi;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.model.Age;
import com.codecool.catagochi.model.Gender;
import com.codecool.catagochi.repository.CatRepository;
import com.codecool.catagochi.service.CatService;
import com.codecool.catagochi.service.CatServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@TestPropertySource(locations = "classpath:application-test.properties")
@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
public class CatagochiApplicationTests {
    @Autowired(required = true)
    private CatRepository catRepository;

    @Autowired
    @Qualifier("catImpl")
    private CatService catServiceImpl;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void saveOneSimple() {
        Cat cat = Cat.builder()
                .name("Maszat")
                .hungry(false)
                .build();
        catRepository.save(cat);

        assertThat(catRepository.findAll()).hasSize(1);
    }

}
