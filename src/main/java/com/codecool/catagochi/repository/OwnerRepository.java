package com.codecool.catagochi.repository;

import com.codecool.catagochi.entity.Cat;
import com.codecool.catagochi.entity.Owner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    @Transactional
    @Query("SELECT o from Owner o")
    List<Owner> listAllOwner();
}
