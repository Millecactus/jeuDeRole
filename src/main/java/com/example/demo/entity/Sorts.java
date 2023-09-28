package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import java.util.List;

@Entity
@Data
@ToString
@Table(name="sorts")
public class Sorts {

    @Id
    private Integer id;

    @Column(name ="resistance")
    private Integer degats;

    @Column (name ="nom")
    private String nom;

    @Column (name ="styleMagie")
    private List <String> styleMagie;

    @Column(name="ListeSorts")
    private List <String> ListeSorts;

    @ManyToOne
    Personnages personnagesSorts;

}
