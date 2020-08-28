package com.codecool.catagochi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Owner {
    @Id
    @GeneratedValue
    private @Setter(AccessLevel.PRIVATE) Long id;

    private String username;
    @JsonIgnore
    private String password;

//    @Builder.Default
//    @OneToOne(targetEntity = Cat.class, mappedBy = "owner")
//    @JsonBackReference
//    private Cat cat = null;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    @Singular
    @JsonBackReference
    private Set<Cat> cats;
}
