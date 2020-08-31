package com.codecool.catagochi.entity;

import com.codecool.catagochi.model.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Cat {
    @Id
    @GeneratedValue
    private @Setter(AccessLevel.PRIVATE) Long id;

    @Builder.Default
    private String name = "Anonymus";

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private @Setter(AccessLevel.PRIVATE) Gender gender = Gender.UNKNOWN;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private @Setter(AccessLevel.PRIVATE) Age age = Age.UNKOWN;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private @Setter(AccessLevel.PRIVATE)
    Size size = Size.UNKNOWN;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private @Setter(AccessLevel.PRIVATE)
    Breed breed = Breed.UNKNOWN;

    private String img;

    @Builder.Default
    private boolean hungry = true;

    @Builder.Default
    private boolean thirsty = true;

    @Builder.Default
    private boolean litterBoxClean = true;

    @Builder.Default
    private boolean adopted = false;

    @Builder.Default
    private int happiness = 3;

//    @Builder.Default
//    @OneToOne(targetEntity = Owner.class)
//    @JsonManagedReference
//    private Owner owner = null;
    @ManyToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name = "id", referencedColumnName = "cat_id")
    //@JoinTable(name = "cat", joinColumns =@JoinColumn(name = "cat_id"), inverseJoinColumns=@JoinColumn(name="friend_id"))
    private Owner owner;

    public void escape() {
        System.out.println("Your cat got unhappy and has run away from you!");
    }
}