package com.codecool.catagochi.repository;

import com.codecool.catagochi.entity.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CatRepository extends CrudRepository<Cat, Long> {

    @Query("SELECT c from Cat c WHERE c.adopted=true")
    List<Cat> findAllAdoptedCat();

    @Query("SELECT c from Cat c WHERE c.adopted=true AND c.id=:id")
    Cat findMyCatById(Long id);

    @Query("SELECT c from Cat c WHERE c.id=:id")
    Cat findCatById(Long id);
}
