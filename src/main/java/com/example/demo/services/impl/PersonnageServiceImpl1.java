package com.example.demo.services.impl;

import com.example.demo.dto.PersonnagesDTO;
import com.example.demo.services.PersonnageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("PersonnageServiceImpl1")

public class PersonnageServiceImpl implements PersonnageService {
    @Override
    public PersonnagesDTO save(PersonnagesDTO dto) {
        return null;
    }

    @Override
    public PersonnagesDTO findById(Integer id) {
        return null;
    }

    @Override
    public PersonnagesDTO findByName(String nom) {
        return null;
    }

    @Override
    public PersonnagesDTO findByLevel(Integer level) {
        return null;
    }

    @Override
    public List<PersonnagesDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

}
