package com.example.demo.dto;

import com.example.demo.entity.Personnages;

import com.example.demo.entity.Sorts;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class SortsDTO {

    private Integer id;
    private Integer degats;
    private String nom;
    private List<String> styleMagie;
    private List <String> ListeSorts;
    Personnages personnagesSorts;

    public  static  SortsDTO fromEntity (Sorts sorts){

        if(sorts ==null){
            return null;
        }

        return SortsDTO.builder()
                .id(sorts.getId())
                .degats(sorts.getDegats())
                .nom(sorts.getNom())
                .styleMagie(sorts.getStyleMagie())
                .ListeSorts(sorts.getListeSorts())
                .personnagesSorts(sorts.getPersonnagesSorts())
                .build();
    }
}
