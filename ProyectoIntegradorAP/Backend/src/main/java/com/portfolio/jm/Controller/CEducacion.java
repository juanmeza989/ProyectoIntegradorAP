/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jm.Controller;

import com.portfolio.jm.Dto.DtoEducacion;
import com.portfolio.jm.Entity.Educacion;
import com.portfolio.jm.Security.Controller.Mensaje;
import com.portfolio.jm.Service.SEducacion;
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
@RequestMapping("educat")
@CrossOrigin(origins="https://frontendjmap.web.app")
public class CEducacion {
    @Autowired
    SEducacion sEducacion;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list=sEducacion.list(); 
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!sEducacion.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Educacion educacion = sEducacion.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sEducacion.existById(id)) 
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        
        sEducacion.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoEducacion dtoedu){
        if (StringUtils.isBlank(dtoedu.getNombreEdu()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"),HttpStatus.BAD_REQUEST);
        if(sEducacion.existsByNombreEdu(dtoedu.getNombreEdu()))
            return new ResponseEntity(new Mensaje("Esa educacion existe"),HttpStatus.BAD_REQUEST);
        
        Educacion educacion = new Educacion(dtoedu.getNombreEdu(),dtoedu.getDescripcionEdu(), dtoedu.getLogoEdu());
        sEducacion.save(educacion);
        
        return new ResponseEntity(new Mensaje("Educacion agregada"),HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody DtoEducacion dtoedu){
        if(!sEducacion.existById(id))
            return new ResponseEntity(new Mensaje("el id no existe"),HttpStatus.BAD_REQUEST);
        if(sEducacion.existsByNombreEdu(dtoedu.getNombreEdu()) && sEducacion.getByNombreEdu(dtoedu.getNombreEdu()).get().getId() != id)
            return new ResponseEntity(new Mensaje("esa educacion ya existe"),HttpStatus.BAD_REQUEST);
            
        if(StringUtils.isBlank(dtoedu.getNombreEdu()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"),HttpStatus.BAD_REQUEST);
        
        Educacion educacion = sEducacion.getOne(id).get();
        educacion.setNombreEdu(dtoedu.getNombreEdu());
        educacion.setDescripcionEdu(dtoedu.getDescripcionEdu());
        educacion.setLogoEdu(dtoedu.getLogoEdu());
        
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("la educacion fue actualizada"),HttpStatus.OK);
    }
}
