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
public class DtoAcercade {
    @NotBlank
    private String acercadeM;
   
    
    //constructor

    public DtoAcercade() {
    }

    public DtoAcercade(String acercadeM) {
        this.acercadeM = acercadeM;
    }

    
    
   

    
 //gys

    public String getAcercadeM() {
        return acercadeM;
    }

    public void setAcercadeM(String acercadeM) {
        this.acercadeM = acercadeM;
    }

   
   
}
