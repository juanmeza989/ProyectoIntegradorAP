/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jm.Controller;

import com.portfolio.jm.Dto.DtoPersonaa;
import com.portfolio.jm.Entity.Personaa;
import com.portfolio.jm.Security.Controller.Mensaje;
import com.portfolio.jm.Service.SPersonaa;
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
@RequestMapping("personaa")
@CrossOrigin(origins="https://frontendjmap.web.app")
public class CPersonaa {
    @Autowired
    SPersonaa sPersonaa;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Personaa>> list(){
        List<Personaa> list=sPersonaa.list(); 
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Personaa> getById(@PathVariable("id") int id){
        if(!sPersonaa.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Personaa personaa = sPersonaa.getOne(id).get();
        return new ResponseEntity(personaa, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sPersonaa.existById(id)) 
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        
        sPersonaa.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoPersonaa dtopersonaa){
        if (StringUtils.isBlank(dtopersonaa.getNombrePersonaa()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"),HttpStatus.BAD_REQUEST);
        if(sPersonaa.existsByNombrePersonaa(dtopersonaa.getNombrePersonaa()))
            return new ResponseEntity(new Mensaje("Esa personaa existe"),HttpStatus.BAD_REQUEST);
        
        Personaa personaa = new Personaa(dtopersonaa.getNombrePersonaa(),dtopersonaa.getApellidoPersonaa(),dtopersonaa.getTituloPersonaa());
        sPersonaa.save(personaa);
        
        return new ResponseEntity(new Mensaje("Personaa agregada"),HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody DtoPersonaa dtopersonaa){
        if(!sPersonaa.existById(id))
            return new ResponseEntity(new Mensaje("el id no existe"),HttpStatus.BAD_REQUEST);
        if(sPersonaa.existsByNombrePersonaa(dtopersonaa.getNombrePersonaa()) && sPersonaa.getByNombrePersonaa(dtopersonaa.getNombrePersonaa()).get().getId() != id)
            return new ResponseEntity(new Mensaje("esa personaa ya existe"),HttpStatus.BAD_REQUEST);
            
        if(StringUtils.isBlank(dtopersonaa.getNombrePersonaa()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"),HttpStatus.BAD_REQUEST);
        
        Personaa personaa = sPersonaa.getOne(id).get();
        personaa.setNombrePersonaa(dtopersonaa.getNombrePersonaa());
        personaa.setApellidoPersonaa(dtopersonaa.getApellidoPersonaa());
        personaa.setTituloPersonaa(dtopersonaa.getTituloPersonaa());
        
        sPersonaa.save(personaa);
        return new ResponseEntity(new Mensaje("la personaa fue actualizada"),HttpStatus.OK);
    }
}
