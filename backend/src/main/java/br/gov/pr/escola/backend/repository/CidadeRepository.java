/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gov.pr.escola.backend.repository;

import br.gov.pr.escola.backend.entity.CidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */
@Repository
public interface CidadeRepository extends JpaRepository<CidadeEntity, Long> {
    
    @Query("SELECT c FROM CidadeEntity c WHERE c.id = ?1")
    CidadeEntity getById(Long id);
    
}
