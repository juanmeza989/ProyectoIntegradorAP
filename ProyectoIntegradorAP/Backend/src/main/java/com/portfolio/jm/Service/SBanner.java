/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jm.Service;

import com.portfolio.jm.Entity.Banner;
import com.portfolio.jm.Repository.RBanner;
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
public class SBanner {
    @Autowired
    RBanner rBanner;
    
    public List<Banner> list(){
        return rBanner.findAll();
    }
    
    public Optional<Banner> getOne(int id){
        return rBanner.findById(id);
    }
    
    public Optional<Banner> getBySaludoB(String saludoB){
        return rBanner.findBySaludoB(saludoB);
    }
    
    public void save(Banner ban){
        rBanner.save(ban);
    }
    
    public void delete(int id){
        rBanner.deleteById(id);
    }
    
    public boolean existById(int id){
        return rBanner.existsById(id);
    }
    
    public boolean existsBySaludoB(String saludoB){
        return rBanner.existsBySaludoB(saludoB);
    }
    
}
