/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jm.Service;

import com.portfolio.jm.Entity.Foto;
import com.portfolio.jm.Repository.RFoto;
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
public class SFoto {
    @Autowired
    RFoto rFoto;
    
    public List<Foto> list(){
        return rFoto.findAll();
    }
    
    public Optional<Foto> getOne(int id){
        return rFoto.findById(id);
    }
    
    public Optional<Foto> getByFotoP(String fotoP){
        return rFoto.findByFotoP(fotoP);
    }
    
    public void save(Foto fot){
        rFoto.save(fot);
    }
    
    public void delete(int id){
        rFoto.deleteById(id);
    }
    
    public boolean existById(int id){
        return rFoto.existsById(id);
    }
    
    public boolean existsByFotoP(String fotoP){
        return rFoto.existsByFotoP(fotoP);
    }
    
}
