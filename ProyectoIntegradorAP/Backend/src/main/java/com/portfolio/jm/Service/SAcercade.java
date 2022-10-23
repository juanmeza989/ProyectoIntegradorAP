/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jm.Service;

import com.portfolio.jm.Entity.Acercade;
import com.portfolio.jm.Repository.RAcercade;
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
public class SAcercade {
    @Autowired
    RAcercade rAcercade;
    
    public List<Acercade> list(){
        return rAcercade.findAll();
    }
    
    public Optional<Acercade> getOne(int id){
        return rAcercade.findById(id);
    }
    
    public Optional<Acercade> getByAcercadeM(String acercadeM){
        return rAcercade.findByAcercadeM(acercadeM);
    }
    
    public void save(Acercade acer){
        rAcercade.save(acer);
    }
    
    public void delete(int id){
        rAcercade.deleteById(id);
    }
    
    public boolean existById(int id){
        return rAcercade.existsById(id);
    }
    
    public boolean existsByAcercadeM(String acercadeM){
        return rAcercade.existsByAcercadeM(acercadeM);
    }
    
}
