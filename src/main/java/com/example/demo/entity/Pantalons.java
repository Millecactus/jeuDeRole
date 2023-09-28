package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@ToString
@Table(name="pantalons")
public class Pantalons {

    @Id
    private Integer id;

    @Column(name ="resistance")
    private Integer resistance;

    @Column (name ="nom")
    private String nom;

    @OneToOne
    Personnages personnages;

}
