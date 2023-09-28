package com.example.demo.dto;

import com.example.demo.entity.Pantalons;
import com.example.demo.entity.Personnages;
import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class PantalonsDTO {

    private Integer id;
    private Integer resistance;
    private String nom;
    Personnages personnages;

    public static PantalonsDTO fromEntity(Pantalons pantalons){

        if (pantalons ==null){
            return null; //TODO: lever une exception
        }

        return PantalonsDTO.builder()
                .id(pantalons.getId())
                .resistance(pantalons.getResistance())
                .nom(pantalons.getNom())
                .personnages(pantalons.getPersonnages())
                .build();
    }


}
