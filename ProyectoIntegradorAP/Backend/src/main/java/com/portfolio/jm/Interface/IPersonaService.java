package com.portfolio.jm.Interface;

import com.portfolio.jm.Entity.Persona;
import java.util.List;




public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un usuario
    public void deletePersona(Long id);
    
    //buscar una persona
    public Persona findPersona(Long id);
}
