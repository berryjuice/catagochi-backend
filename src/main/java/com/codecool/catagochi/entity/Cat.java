package com.codecool.catagochi.entity;

import com.codecool.catagochi.model.Age;
import com.codecool.catagochi.model.Gender;
import lombok.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
    private String name;
    private @Setter(AccessLevel.PRIVATE) Gender gender;
    private @Setter(AccessLevel.PRIVATE) Age age;
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