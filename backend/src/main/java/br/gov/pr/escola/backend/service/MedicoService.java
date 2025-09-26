/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.service;

import br.gov.pr.escola.backend.entity.MedicoEntity;
import br.gov.pr.escola.backend.util.IBaseService;
import br.gov.pr.escola.backend.repository.MedicoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class MedicoService implements IBaseService<MedicoEntity>{

    @Autowired
    private MedicoRepository repository;
    
    @Override
    public List<MedicoEntity> findAll() {
        return this.repository.findAll();
    }

    @Override
    public MedicoEntity getById(Long id) {
        return this.repository.getById(id);
    }

    @Override
    public MedicoEntity save(MedicoEntity entity) {
        return this.repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
    
}
