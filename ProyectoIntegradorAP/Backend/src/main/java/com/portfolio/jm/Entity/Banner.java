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
public class Banner {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String saludoB;
    private String imagenB;
    
    //constructor

    public Banner() {
    }

   
   

    public Banner(String saludoB, String imagenB) {
        this.saludoB = saludoB;
        this.imagenB = imagenB;
    }

     //getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
