/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jm.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author juanm
 */
public class DtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    
    private String logoE;
    
    //constructor

    public DtoExperiencia() {
    }

    public DtoExperiencia(String nombreE, String descripcionE, String logoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.logoE = logoE;
    }
    
    //gys

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getLogoE() {
        return logoE;
    }

    public void setLogoE(String logoE) {
        this.logoE = logoE;
    }

    
    
    
}
