package com.example.demo.exceptions;


public enum errorsCode {
    PERSONNAGE_NOT_FOUND(1000),
    PERSONNAGE_NOT_VALID(1001),
    ARME_NOT_FOUND (2000),
    ARME_NOT_VALID(2001),
    COMPAGNON_NOT_FOUND(3000),
    COMPAGNON_NOT_VALID(3001),
    SORT_NOT_FOUND(4000),
    SORT_NOT_VALID(4001),
    CASQUE_NOT_FOUND(5000),
    CASQUE_NOT_VALID(5001),
    PLASTRON_NOT_FOUND(6000),
    PLASTRON_NOT_VALID(6001),
    PANTALON_NOT_FOUND(7000),
    PANTALON_NOT_VALID(7001),
    ;


    errorsCode(Integer code) {
        this.code = code;
    }
    private Integer code;

    public Integer getCode(){
        return code;
    }

}
