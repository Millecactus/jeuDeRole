package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@ToString
@Table (name= "personnage")
public class Personnages {

    @Id
    private Integer id;

    @Column (name = "nom")
    public String nom;

    @Column (name = "classe")
    public String classe;

    @Column (name = "level")
    public Integer level;

    @OneToMany(mappedBy = "personnagesArmes")
    List<Armes> listeArmes;

    @OneToOne
    Compagnons compagnons;

    @OneToMany (mappedBy = "personnagesSorts")
    List <Sorts> ListeSorts;

    @OneToOne
    Casques casques;

    @OneToOne
    Pantalons pantalons;

    @OneToOne
    Plastrons plastrons;
}
