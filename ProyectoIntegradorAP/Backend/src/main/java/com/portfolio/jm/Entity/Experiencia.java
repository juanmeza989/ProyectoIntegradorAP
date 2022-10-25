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
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String logoE;
    
    //constructor

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String logoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.logoE = logoE;
    }
    //getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
