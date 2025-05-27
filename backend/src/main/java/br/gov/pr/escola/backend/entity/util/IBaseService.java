/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gov.pr.escola.backend.entity.util;

import java.util.List;

/**
 *
 * @author Administrador
 */
public interface IBaseService<T> {
    
    public List<T> findAll();
    
    public T getById(Long id);
    
    public T save(T entity);
    
    public void deleteById(Long id);
    
}
