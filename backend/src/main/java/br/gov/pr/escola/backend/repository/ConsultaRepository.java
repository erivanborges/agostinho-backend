/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gov.pr.escola.backend.repository;

import br.gov.pr.escola.backend.entity.ConsultaEntity;
import java.sql.Time;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */
@Repository
public interface ConsultaRepository extends JpaRepository<ConsultaEntity, Long> {
    
    @Query("SELECT c FROM ConsultaEntity c WHERE c.id = ?1")
    ConsultaEntity getById(Long id);
    
    @Query("SELECT c FROM ConsultaEntity c WHERE c.hora BETWEEN {t '13:00:00'} AND {t '18:00:00'}")
    List<ConsultaEntity> buscarTodasConsultasTarde(); 
    
    //@Query("SELECT c FROM ConsultaEntity c WHERE c.hora BETWEEN :hrInicial AND :hrFinal")
    //List<ConsultaEntity> buscarTodasConsultasTarde(@Param("hrInicial") Time hrInicial, @Param("hrFinal") Time hrFinal);
    
    @Query("SELECT c FROM ConsultaEntity c WHERE c.hora BETWEEN ?1 AND ?2")
    List<ConsultaEntity> buscarTodasConsultasTarde(Time hrInicial, Time hrFinal);
    
    @Query("SELECT c FROM ConsultaEntity c INNER JOIN c.medico m WHERE m.nome = 'Joao'")
    List<ConsultaEntity> buscarConsultasMedicoJoao();
    
    //@Query("SELECT c FROM ConsultaEntity c INNER JOIN c.medico m WHERE m.nome = ?1")
    //List<ConsultaEntity> buscarConsultasMedico(String nomeMedico);
    
    @Query("SELECT c FROM ConsultaEntity c INNER JOIN c.medico m WHERE m.nome = :nome")
    List<ConsultaEntity> buscarConsultasMedico(@Param("nome") String nomeMedico);
}
