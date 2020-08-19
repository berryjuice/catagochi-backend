package com.codecool.catagochi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

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

    @OneToOne(mappedBy = "owner")
    private Cat cat;
}
