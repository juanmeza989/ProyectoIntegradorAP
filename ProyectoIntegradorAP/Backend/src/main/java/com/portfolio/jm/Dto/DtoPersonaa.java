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
public class DtoPersonaa {
    @NotBlank
    private String nombrePersonaa;
    @NotBlank
    private String apellidoPersonaa;
    
    //constructor

    public DtoPersonaa() {
    }

    public DtoPersonaa(String nombrePersonaa, String apellidoPersonaa) {
        this.nombrePersonaa = nombrePersonaa;
        this.apellidoPersonaa = apellidoPersonaa;
    }
    
    //gys

    public String getNombrePersonaa() {
        return nombrePersonaa;
    }

    public void setNombrePersonaa(String nombrePersonaa) {
        this.nombrePersonaa = nombrePersonaa;
    }

    public String getApellidoPersonaa() {
        return apellidoPersonaa;
    }

    public void setApellidoPersonaa(String apellidoPersonaa) {
        this.apellidoPersonaa = apellidoPersonaa;
    }

   
}