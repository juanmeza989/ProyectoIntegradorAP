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
public class DtoFoto {
    @NotBlank
    private String fotoP;
   
    
    //constructor

    public DtoFoto() {
    }

    public DtoFoto(String fotoP) {
        this.fotoP = fotoP;
    }

    
    
   

    
 //gys

    public String getFotoP() {
        return fotoP;
    }

    public void setFotoP(String fotoP) {
        this.fotoP = fotoP;
    }

   
}
