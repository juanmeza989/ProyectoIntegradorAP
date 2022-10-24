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
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nombreEdu;
    private String descripcionEdu;
    private String logoEdu;
    
    //constructor

    public Educacion() {
    }

    public Educacion(String nombreEdu, String descripcionEdu, String logoEdu) {
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.logoEdu = logoEdu;
    }
    //getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
