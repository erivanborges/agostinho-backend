/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.controller;

import br.gov.pr.escola.backend.entity.CidadeEntity;
import br.gov.pr.escola.backend.service.CidadeService;
import java.util.List;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrador
 */
@RestController
public class CidadeController {
    
    @Autowired
    private CidadeService service;

    @GetMapping("api/v1/cidades")
    public ResponseEntity<List<CidadeEntity>> findAll() {
        List<CidadeEntity> cidades = this.service.findAll();

        return new ResponseEntity<List<CidadeEntity>>(cidades, HttpStatus.OK);
    }

    @GetMapping("api/v1/cidades/{id}")
    public ResponseEntity<CidadeEntity> getById(@PathVariable("id") Long id) {
        CidadeEntity cidade = this.service.getById(id);

        return new ResponseEntity<CidadeEntity>(cidade, HttpStatus.OK);
    }

    @PostMapping("api/v1/cidades")
    public ResponseEntity create(@RequestBody CidadeEntity cidade) {
        try {
            CidadeEntity newCidade = this.service.save(cidade);
            return ResponseEntity.status(HttpStatus.OK).body(newCidade);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex);
        }
    }

    @PutMapping("api/v1/cidades/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody CidadeEntity cidade) {
        try {
            CidadeEntity found = this.service.getById(id);

            if (found != null) {
                cidade.setId(id);
                this.service.save(cidade);
                return ResponseEntity.status(HttpStatus.OK).body(cidade);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
            }

        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex);
        }
    }

    @DeleteMapping("api/v1/cidades/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        try {

            this.service.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Record Deleted");

        } catch (ConstraintViolationException ex) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(ex.getMessage());
        } catch (EmptyResultDataAccessException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
        }
    }
}
