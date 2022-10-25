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
public class DtoEducacion {
    @NotBlank
    private String nombreEdu;
    @NotBlank
    private String descripcionEdu;
    
    private String logoEdu;
    
    //constructor

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreEdu, String descripcionEdu, String logoEdu) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.logoEdu = logoEdu;
    }
    
    //gys

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getLogoEdu() {
        return logoEdu;
    }

    public void setLogoEdu(String logoEdu) {
        this.logoEdu = logoEdu;
    }

   
}