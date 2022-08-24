/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jm.Controller;

import com.portfolio.jm.Dto.DtoBanner;
import com.portfolio.jm.Entity.Banner;
import com.portfolio.jm.Security.Controller.Mensaje;
import com.portfolio.jm.Service.SBanner;
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
@RequestMapping("banner")
@CrossOrigin(origins="http://localhost:4200")
public class CBanner {
    @Autowired
    SBanner sBanner;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Banner>> list(){
        List<Banner> list=sBanner.list(); 
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Banner> getById(@PathVariable("id") int id){
        if(!sBanner.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Banner banner = sBanner.getOne(id).get();
        return new ResponseEntity(banner, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sBanner.existById(id)) 
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        
        sBanner.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoBanner dtobanner){
        if (StringUtils.isBlank(dtobanner.getSaludoB()))
            return new ResponseEntity(new Mensaje("Campo Obligatorio"),HttpStatus.BAD_REQUEST);
               
        Banner banner = new Banner(dtobanner.getSaludoB(),dtobanner.getImagenB());
        sBanner.save(banner);
        
        return new ResponseEntity(new Mensaje("Banner agregada"),HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody DtoBanner dtobanner){
        if(!sBanner.existById(id))
            return new ResponseEntity(new Mensaje("el id no existe"),HttpStatus.BAD_REQUEST);
        if(sBanner.existsBySaludoB(dtobanner.getSaludoB()) && sBanner.getBySaludoB(dtobanner.getSaludoB()).get().getId() != id)
            return new ResponseEntity(new Mensaje("esa banner ya existe"),HttpStatus.BAD_REQUEST);
            
        if(StringUtils.isBlank(dtobanner.getSaludoB()))
            return new ResponseEntity(new Mensaje("el saludo es obligatorio"),HttpStatus.BAD_REQUEST);
        
        Banner banner = sBanner.getOne(id).get();
        banner.setSaludoB(dtobanner.getSaludoB());
        banner.setImagenB(dtobanner.getImagenB());
        
        sBanner.save(banner);
        return new ResponseEntity(new Mensaje("El banner fue actualizado"),HttpStatus.OK);
    }
}