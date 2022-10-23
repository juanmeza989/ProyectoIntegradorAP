/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.jm.Repository;

import com.portfolio.jm.Entity.Acercade;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author juanm
 */
@Repository
public interface RAcercade extends JpaRepository<Acercade, Integer> {
    public Optional<Acercade> findByAcercadeM(String acercadeM);
    public boolean existsByAcercadeM(String acercadeM);
    
}
