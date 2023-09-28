package com.example.demo.dto;

import com.example.demo.entity.Personnages;
import com.example.demo.entity.Plastrons;
import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class PlastronsDTO {
    private Integer id;

    private Integer resistance;

    private String nom;

    Personnages personnages;

    public static PlastronsDTO fromEntity (Plastrons plastrons){

        if(plastrons ==null){
            return null;
        }

        return PlastronsDTO.builder()
                .id(plastrons.getId())
                .resistance(plastrons.getResistance())
                .nom(plastrons.getNom())
                .personnages(plastrons.getPersonnages())
                .build();
    }
}
