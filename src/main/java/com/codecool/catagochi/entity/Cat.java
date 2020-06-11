package com.codecool.catagochi.entity;

import com.codecool.catagochi.model.Age;
import com.codecool.catagochi.model.Breed;
import com.codecool.catagochi.model.Gender;
import com.codecool.catagochi.model.Size;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
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
}