package com.example.demo.dto;

import com.example.demo.entity.*;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data


public class PersonnagesDTO {
    private Integer id;

    public String nom;
    public String classe;
    public Integer level;
    List<Armes> listeArmes;
    Compagnons compagnons;
    List<Sorts> ListeSorts;
    Casques casques;
    Pantalons pantalons;
    Plastrons plastrons;

    public static PersonnagesDTO fromEntity (Personnages personnages){

        if (personnages==null){
            return null;
        }
        return PersonnagesDTO.builder()
                .id(personnages.getId())
                .nom(personnages.getNom())
                .level(personnages.getLevel())
                .listeArmes(personnages.getListeArmes())
                .compagnons(personnages.getCompagnons())
                .ListeSorts(personnages.getListeSorts())
                .casques(personnages.getCasques())
                .pantalons(personnages.getPantalons())
                .plastrons(personnages.getPlastrons())
                .build();
    }

}
