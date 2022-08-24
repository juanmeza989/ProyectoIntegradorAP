/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.jm.Repository;

import com.portfolio.jm.Entity.Foto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juanm
 */
@Repository
public interface RFoto extends JpaRepository<Foto, Integer> {
    public Optional<Foto> findByFotoP(String fotoP);
    public boolean existsByFotoP(String fotoP);
    
}
