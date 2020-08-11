package com.codecool.catagochi.entity;

import com.codecool.catagochi.model.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Cat implements Serializable {
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

    @OneToOne(mappedBy = "cat")
    private Owner owner;

    public void escape() {
        System.out.println("Your cat got unhappy and has run away from you!");
    }
}