package com.example.demo.dto;

import com.example.demo.entity.Armes;
import com.example.demo.entity.Personnages;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class ArmesDTO {

    private  Integer id;
    private List<String> listeArmes =new ArrayList<>();
    private Integer degats;
    private String nom;

    Personnages personnagesArmes;
    public static ArmesDTO fromEntity (Armes armes){

        if(armes ==null){
            return null;
        }

        return ArmesDTO.builder()
                .id(armes.getId())
                .degats(armes.getDegats())
                .nom(armes.getNom())
                .listeArmes(armes.getListeArmes())
                .build();
    }

}
