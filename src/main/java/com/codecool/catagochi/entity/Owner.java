package com.codecool.catagochi.entity;

import lombok.AccessLevel;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Owner {
    @Id
    @GeneratedValue
    private @Setter(AccessLevel.PRIVATE) Long id;
}
