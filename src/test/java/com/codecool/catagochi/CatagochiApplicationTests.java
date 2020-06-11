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
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
@EnableScheduling
public class CatagochiApplicationTests {



}
