/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.service;

import br.gov.pr.escola.backend.entity.AmbulatorioEntity;
import br.gov.pr.escola.backend.util.IBaseService;
import br.gov.pr.escola.backend.repository.AmbulatorioRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class AmbulatorioService implements IBaseService<AmbulatorioEntity>{
    
    private AmbulatorioRepository repository;
    
    @Override
    public List<AmbulatorioEntity> findAll() {
        return this.repository.findAll();
    }
    
    @Override
    public AmbulatorioEntity getById(Long id) {
        return this.repository.getById(id);
    }
    
    @Override
    public AmbulatorioEntity save(AmbulatorioEntity entity) {
        return this.repository.save(entity);
    }
    
    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
    
}
