/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author juanm
 */
@Entity
public class Foto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String fotoP;
   
    
    //constructor

    public Foto() {
    }

    public Foto(String fotoP) {
        this.fotoP = fotoP;
    }

    //gys
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFotoP() {
        return fotoP;
    }

    public void setFotoP(String fotoP) {
        this.fotoP = fotoP;
    }

   
   

    
}
