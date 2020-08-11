package com.codecool.catagochi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Owner implements Serializable {
    @Id
    @GeneratedValue
    private @Setter(AccessLevel.PRIVATE) Long id;

   // @JsonIgnore
    private String username;
    @JsonIgnore
    private String password;

    @OneToOne
    @JoinColumn(name = "cat_id")
    @JsonBackReference
    private Cat cat;
}
