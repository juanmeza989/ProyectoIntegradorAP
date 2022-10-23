/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jm.Controller;

import com.portfolio.jm.Dto.DtoAcercade;
import com.portfolio.jm.Entity.Acercade;
import com.portfolio.jm.Security.Controller.Mensaje;
import com.portfolio.jm.Service.SAcercade;
import java.util.List;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





/**
 *
 * @author juanm
 */
@RestController
@RequestMapping("acercade")
@CrossOrigin(origins="http://localhost:4200")
public class CAcercade {
    @Autowired
    SAcercade sAcercade;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Acercade>> list(){
        List<Acercade> list=sAcercade.list(); 
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Acercade> getById(@PathVariable("id") int id){
        if(!sAcercade.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Acercade acercade = sAcercade.getOne(id).get();
        return new ResponseEntity(acercade, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sAcercade.existById(id)) 
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        
        sAcercade.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoAcercade dtoacercade){
        if (StringUtils.isBlank(dtoacercade.getAcercadeM()))
            return new ResponseEntity(new Mensaje("Campo Obligatorio"),HttpStatus.BAD_REQUEST);
               
        Acercade acercade = new Acercade(dtoacercade.getAcercadeM());
        sAcercade.save(acercade);
        
        return new ResponseEntity(new Mensaje("Acercade agregada"),HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody DtoAcercade dtoacercade){
        if(!sAcercade.existById(id))
            return new ResponseEntity(new Mensaje("el id no existe"),HttpStatus.BAD_REQUEST);
        if(sAcercade.existsByAcercadeM(dtoacercade.getAcercadeM()) && sAcercade.getByAcercadeM(dtoacercade.getAcercadeM()).get().getId() != id)
            return new ResponseEntity(new Mensaje("esa acercade ya existe"),HttpStatus.BAD_REQUEST);
            
        if(StringUtils.isBlank(dtoacercade.getAcercadeM()))
            return new ResponseEntity(new Mensaje("el saludo es obligatorio"),HttpStatus.BAD_REQUEST);
        
        Acercade acercade = sAcercade.getOne(id).get();
        acercade.setAcercadeM(dtoacercade.getAcercadeM());
        
        sAcercade.save(acercade);
        return new ResponseEntity(new Mensaje("El acercade fue actualizado"),HttpStatus.OK);
    }
}