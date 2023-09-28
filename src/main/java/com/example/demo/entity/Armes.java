package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table (name="armes")
public class Armes {

    @Id

    private  Integer id;

    @Column(name="ListeArmes")
    private List<String>  listeArmes =new ArrayList<>();

    @Column(name="dégats")
    private Integer degats;

    @Column(name="nomArme")
    private String nom;

    @ManyToOne
    Personnages personnagesArmes;

}
