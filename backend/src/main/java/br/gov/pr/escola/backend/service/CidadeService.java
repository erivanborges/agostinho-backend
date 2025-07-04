/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.service;

import br.gov.pr.escola.backend.entity.CidadeEntity;
import br.gov.pr.escola.backend.util.IBaseService;
import br.gov.pr.escola.backend.repository.CidadeRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class CidadeService implements IBaseService<CidadeEntity> {
    
    private CidadeRepository repository;
    
    @Override
    public List<CidadeEntity> findAll() {
        return this.repository.findAll();
    }
    
    @Override
    public CidadeEntity getById(Long id) {
        return this.repository.getById(id);
    }
    
    @Override
    public CidadeEntity save(CidadeEntity entity) {
        return this.repository.save(entity);
    }
    
    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
    
}
