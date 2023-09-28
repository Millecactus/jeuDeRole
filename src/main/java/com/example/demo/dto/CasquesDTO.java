package com.example.demo.dto;

import com.example.demo.entity.Casques;
import com.example.demo.entity.Personnages;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CasquesDTO {

    private Integer id;
    private Integer resistance;
    private String nom;
    Personnages personnages;


    public static  CasquesDTO fromEntity(Casques casques){

        if(casques ==null){
            return null;
        }

        return CasquesDTO.builder()
                .id(casques.getId())
                .resistance(casques.getResistance())
                .nom(casques.getNom())
                .personnages(casques.getPersonnages())
                .build();
    }

}
