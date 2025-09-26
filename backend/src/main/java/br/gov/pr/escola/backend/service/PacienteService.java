/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.service;

import br.gov.pr.escola.backend.entity.PacienteEntity;
import br.gov.pr.escola.backend.util.IBaseService;
import br.gov.pr.escola.backend.repository.PacienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class PacienteService implements IBaseService<PacienteEntity> {

    @Autowired
    private PacienteRepository repository;
    
    @Override
    public List<PacienteEntity> findAll() {
        return this.repository.findAll();
    }

    @Override
    public PacienteEntity getById(Long id) {
        return this.repository.getById(id);
    }

    @Override
    public PacienteEntity save(PacienteEntity entity) {
        return this.repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
    
}
