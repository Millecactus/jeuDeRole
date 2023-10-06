package com.example.demo.services.impl;

import com.example.demo.dto.PlastronsDTO;

import java.util.List;

public interface PlastronsService {

    public PlastronsDTO save (PlastronsDTO plastronsDTO);

    public PlastronsDTO findById (Integer id);

    public PlastronsDTO findByName (String nom);

    public List<PlastronsDTO> findAll;

}
