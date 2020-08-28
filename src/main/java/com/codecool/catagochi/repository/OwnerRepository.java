package com.codecool.catagochi.repository;

import com.codecool.catagochi.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
    @Transactional
    @Query("SELECT DISTINCT o from Owner o")
    List<Owner> listAllOwner();
}
