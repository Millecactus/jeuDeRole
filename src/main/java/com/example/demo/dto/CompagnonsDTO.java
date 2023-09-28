package com.example.demo.dto;

import com.example.demo.entity.Compagnons;
import com.example.demo.entity.Personnages;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CompagnonsDTO {
    private  Integer id;
    public String nom;
    public String classe;
    public Integer level;
    Personnages personnages;

    public static CompagnonsDTO fromEntity (Compagnons compagnons){

        if(compagnons ==null){
            return null;
        }

        return CompagnonsDTO.builder()
                .id(compagnons.getId())
                .nom(compagnons.getNom())
                .classe(compagnons.getClasse())
                .level(compagnons.getLevel())
                .personnages(compagnons.getPersonnages())
                .build();
    }
}
