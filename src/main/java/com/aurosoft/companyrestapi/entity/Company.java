package com.aurosoft.companyrestapi.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "companies")


public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id",nullable = false)
    private int id;


    @Column(name="name", nullable = false)
    private String name;
}
