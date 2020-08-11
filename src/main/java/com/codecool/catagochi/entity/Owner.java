package com.codecool.catagochi.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Builder
//@Data
public class Owner {
    @Id
    @GeneratedValue
    private @Setter(AccessLevel.PRIVATE) Long id;

    private String username;
    private String password;

//    @OneToMany(mappedBy="owner")
//    @Singular
    private List<Cat> cats;
}
