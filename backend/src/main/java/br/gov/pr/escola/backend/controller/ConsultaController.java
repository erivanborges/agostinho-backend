/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.controller;

import br.gov.pr.escola.backend.entity.ConsultaEntity;
import br.gov.pr.escola.backend.service.ConsultaService;
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
public class ConsultaController {

    @Autowired
    private ConsultaService service;

    @GetMapping("api/v1/consultas")
    public ResponseEntity<List<ConsultaEntity>> findAll() {
        List<ConsultaEntity> consultas = this.service.findAll();

        return new ResponseEntity<List<ConsultaEntity>>(consultas, HttpStatus.OK);
    }

    @GetMapping("api/v1/consultas/{id}")
    public ResponseEntity<ConsultaEntity> getById(@PathVariable("id") Long id) {
        ConsultaEntity consulta = this.service.getById(id);

        return new ResponseEntity<ConsultaEntity>(consulta, HttpStatus.OK);
    }

    @PostMapping("api/v1/consultas")
    public ResponseEntity create(@RequestBody ConsultaEntity consulta) {
        try {
            ConsultaEntity newconsulta = this.service.save(consulta);
            return ResponseEntity.status(HttpStatus.OK).body(newconsulta);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex);
        }
    }

    @PutMapping("api/v1/consultas/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody ConsultaEntity consulta) {
        try {
            ConsultaEntity found = this.service.getById(id);

            if (found != null) {
                consulta.setId(id);
                this.service.save(consulta);
                return ResponseEntity.status(HttpStatus.OK).body(consulta);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
            }

        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex);
        }
    }

    @DeleteMapping("api/v1/consultas/{id}")
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
