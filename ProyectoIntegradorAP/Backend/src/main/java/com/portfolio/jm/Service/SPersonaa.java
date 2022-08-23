/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jm.Service;

import com.portfolio.jm.Entity.Personaa;
import com.portfolio.jm.Repository.RPersonaa;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanm
 */
@Service
@Transactional
public class SPersonaa {
    @Autowired
    RPersonaa rPersonaa;
    
    public List<Personaa> list(){
        return rPersonaa.findAll();
    }
    
    public Optional<Personaa> getOne(int id){
        return rPersonaa.findById(id);
    }
    
    public Optional<Personaa> getByNombrePersonaa(String nombrePersonaa){
        return rPersonaa.findByNombrePersonaa(nombrePersonaa);
    }
    
    public void save(Personaa personaa){
        rPersonaa.save(personaa);
    }
    
    public void delete(int id){
        rPersonaa.deleteById(id);
    }
    
    public boolean existById(int id){
        return rPersonaa.existsById(id);
    }
    
    public boolean existsByNombrePersonaa(String nombrePersonaa){
        return rPersonaa.existsByNombrePersonaa(nombrePersonaa);
    }
    
}
