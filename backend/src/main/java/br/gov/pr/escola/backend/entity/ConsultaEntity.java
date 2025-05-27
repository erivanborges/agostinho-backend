/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "consulta")
public class ConsultaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_consulta", nullable = false)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "cod_medico", nullable = true)
    private MedicoEntity medico;
    
    @ManyToOne
    @JoinColumn(name = "cod_paciente", nullable = true)
    private PacienteEntity paciente;
    
    @Column(name = "data_consulta")
    private Date data;
    
    @Column(name = "hora_consulta")
    private Time hora;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the medico
     */
    public MedicoEntity getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(MedicoEntity medico) {
        this.medico = medico;
    }

    /**
     * @return the paciente
     */
    public PacienteEntity getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the date
     */
    public Date getData() {
        return data;
    }

    /**
     * @param date the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the hora
     */
    public Time getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Time hora) {
        this.hora = hora;
    }
    
}
