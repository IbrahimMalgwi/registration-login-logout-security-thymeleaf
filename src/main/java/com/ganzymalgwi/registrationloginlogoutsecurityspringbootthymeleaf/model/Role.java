package com.ganzymalgwi.registrationloginlogoutsecurityspringbootthymeleaf.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.PrimitiveIterator;

@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
