/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jm.Controller;

import com.portfolio.jm.Dto.DtoFoto;
import com.portfolio.jm.Entity.Foto;
import com.portfolio.jm.Security.Controller.Mensaje;
import com.portfolio.jm.Service.SFoto;
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
@RequestMapping("fotoperfil")
@CrossOrigin(origins="http://localhost:4200")
public class CFoto {
    @Autowired
    SFoto sFoto;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Foto>> list(){
        List<Foto> list=sFoto.list(); 
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Foto> getById(@PathVariable("id") int id){
        if(!sFoto.existById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Foto foto = sFoto.getOne(id).get();
        return new ResponseEntity(foto, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sFoto.existById(id)) 
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        
        sFoto.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoFoto dtofoto){
        if (StringUtils.isBlank(dtofoto.getFotoP()))
            return new ResponseEntity(new Mensaje("Campo Obligatorio"),HttpStatus.BAD_REQUEST);
               
        Foto foto = new Foto(dtofoto.getFotoP());
        sFoto.save(foto);
        
        return new ResponseEntity(new Mensaje("Foto agregada"),HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody DtoFoto dtofoto){
        if(!sFoto.existById(id))
            return new ResponseEntity(new Mensaje("el id no existe"),HttpStatus.BAD_REQUEST);
        if(sFoto.existsByFotoP(dtofoto.getFotoP()) && sFoto.getByFotoP(dtofoto.getFotoP()).get().getId() != id)
            return new ResponseEntity(new Mensaje("esa foto ya existe"),HttpStatus.BAD_REQUEST);
            
        if(StringUtils.isBlank(dtofoto.getFotoP()))
            return new ResponseEntity(new Mensaje("el saludo es obligatorio"),HttpStatus.BAD_REQUEST);
        
        Foto foto = sFoto.getOne(id).get();
        foto.setFotoP(dtofoto.getFotoP());
        
        sFoto.save(foto);
        return new ResponseEntity(new Mensaje("El foto fue actualizado"),HttpStatus.OK);
    }
}