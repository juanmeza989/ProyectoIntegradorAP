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
public class Acercade {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String acercadeM;
   
    
    //constructor

    public Acercade() {
    }

    public Acercade(String acercadeM) {
        this.acercadeM = acercadeM;
    }

    //gys
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcercadeM() {
        return acercadeM;
    }

    public void setAcercadeM(String acercadeM) {
        this.acercadeM = acercadeM;
    }

   
   

    
}
