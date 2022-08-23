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
    
    private String tituloPersonaa;
    
    //constructor

    public DtoPersonaa() {
    }

    public DtoPersonaa(String nombrePersonaa, String apellidoPersonaa, String tituloPersonaa) {
        this.nombrePersonaa = nombrePersonaa;
        this.apellidoPersonaa = apellidoPersonaa;
        this.tituloPersonaa = tituloPersonaa;
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

    public String getTituloPersonaa() {
        return tituloPersonaa;
    }

    public void setTituloPersonaa(String tituloPersonaa) {
        this.tituloPersonaa = tituloPersonaa;
    }

   
}