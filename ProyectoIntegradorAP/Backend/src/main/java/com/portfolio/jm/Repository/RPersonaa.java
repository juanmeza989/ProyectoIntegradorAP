/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.jm.Repository;

import com.portfolio.jm.Entity.Personaa;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juanm
 */
@Repository
public interface RPersonaa extends JpaRepository<Personaa, Integer> {
    public Optional<Personaa> findByNombrePersonaa(String nombrePersonaa);
    public boolean existsByNombrePersonaa(String nombrePersonaa);
    
}
