/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gov.pr.escola.backend.repository;

import br.gov.pr.escola.backend.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */
@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long>{
    
    @Query("SELECT f FROM FuncionarioEntity f WHERE f.id = ?1")
    FuncionarioEntity getById(Long id);
    
}
