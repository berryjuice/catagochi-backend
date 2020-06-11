package com.codecool.catagochi.repository;

import com.codecool.catagochi.entity.Cat;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CatRepository extends CrudRepository<Cat, Long> {

    @Transactional
    @Query("SELECT c from Cat c")
    List<Cat> listAllCat();

    @Transactional
    @Query("SELECT c from Cat c WHERE c.adopted=false")
    List<Cat> listAllAdoptableCat();

    @Query("SELECT c from Cat c WHERE c.adopted=true")
    List<Cat> listMyCats();

    @Query("SELECT c from Cat c WHERE c.adopted=true AND c.id=:id")
    Cat findMyCatById(Long id);

    @Query("SELECT c from Cat c WHERE c.id=:id")
    Cat findCatById(Long id);

    @Transactional
    @Query("UPDATE Cat c SET c.thirsty=false WHERE c.id=:id")
    @Modifying(clearAutomatically = true)
    int giveDrink(@Param("id") Long id);

    @Transactional
    @Query("UPDATE Cat c SET c.hungry=false WHERE c.id=:id")
    @Modifying(clearAutomatically = true)
    int giveFood(@Param("id") Long id);

    @Transactional
    @Query("UPDATE Cat c SET c.litterBoxClean=true WHERE c.id=:id")
    @Modifying(clearAutomatically = true)
    int cleanLitterBox(@Param("id") Long id);

    @Transactional
    @Query("UPDATE Cat c SET c.adopted=true WHERE c.id=:id")
    @Modifying(flushAutomatically = true)
    int adoptCatById(@Param("id") Long id);

    @Transactional
    @Query("UPDATE Cat c SET c.name=:newName WHERE c.id=:id AND c.adopted=true")
    @Modifying(flushAutomatically = true)
    int renameMyCatById(@Param("id") Long id, @Param("newName") String newName);

    @Transactional
    @Query("SELECT c.name from Cat c")
    List<String> listAllMyCatsName();

    @Transactional
    @Query("UPDATE Cat c SET c.hungry=true, c.thirsty=true, c.litterBoxClean=false WHERE c.adopted=true")
    @Modifying(flushAutomatically = true)
    int resetProperties();
}
