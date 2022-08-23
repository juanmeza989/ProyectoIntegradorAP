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
public class Personaa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrePersonaa;
    private String apellidoPersonaa;
    private String tituloPersonaa;

    //constructor
    public Personaa() {
    }

    public Personaa(String nombrePersonaa, String apellidoPersonaa, String tituloPersonaa) {
        this.nombrePersonaa = nombrePersonaa;
        this.apellidoPersonaa = apellidoPersonaa;
        this.tituloPersonaa = tituloPersonaa;
    }

    //getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
