package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table (name ="compagnons")
public class Compagnons {

    @Id
    private  Integer id;
    @Column(name = "nom")
    public String nom;
    @Column (name = "classe")
    public String classe;
    @Column (name = "level")
    public Integer level;


    @OneToOne
    Personnages personnages;

}
