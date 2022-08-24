/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.jm.Repository;

import com.portfolio.jm.Entity.Banner;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juanm
 */
@Repository
public interface RBanner extends JpaRepository<Banner, Integer> {
    public Optional<Banner> findBySaludoB(String saludoB);
    public boolean existsBySaludoB(String saludoB);
    
}
