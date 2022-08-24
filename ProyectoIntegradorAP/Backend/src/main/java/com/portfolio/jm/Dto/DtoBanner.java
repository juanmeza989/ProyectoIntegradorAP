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
public class DtoBanner {
    @NotBlank
    private String saludoB;
    @NotBlank
    private String imagenB;
    
    //constructor

    public DtoBanner() {
    }

    
    
   

    public DtoBanner(String saludoB, String imagenB) {
        this.saludoB = saludoB;
        this.imagenB = imagenB;
    }
 //gys

    public String getSaludoB() {
        return saludoB;
    }

    public void setSaludoB(String saludoB) {
        this.saludoB = saludoB;
    }

    public String getImagenB() {
        return imagenB;
    }

    public void setImagenB(String imagenB) {
        this.imagenB = imagenB;
    }
    
    
}
