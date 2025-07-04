/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.service;

import br.gov.pr.escola.backend.entity.FuncionarioEntity;
import br.gov.pr.escola.backend.util.IBaseService;
import br.gov.pr.escola.backend.repository.FuncionarioRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class FuncionarioService implements IBaseService<FuncionarioEntity>{

    private FuncionarioRepository repository;
    
    @Override
    public List<FuncionarioEntity> findAll() {
        return this.repository.findAll();
    }

    @Override
    public FuncionarioEntity getById(Long id) {
        return this.repository.getById(id);
    }

    @Override
    public FuncionarioEntity save(FuncionarioEntity entity) {
        return this.repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
    
}
