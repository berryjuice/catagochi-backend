package com.codecool.catagochi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue
    private @Setter(AccessLevel.PRIVATE) Long id;

    private String username;
    @JsonIgnore
    private String password;

    @OneToOne(mappedBy = "address")
    private Student student;
}
