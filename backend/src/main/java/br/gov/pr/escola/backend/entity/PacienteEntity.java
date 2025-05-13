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

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "paciente")
public class PacienteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_paciente", nullable = false)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "cod_cidade", nullable = false)
    private CidadeEntity cidade;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "idade")
    private int idade;
    
    @Column(name = "cpf")
    private String cpf;
    
    @Column(name = "doenca")
    private String doenca;

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
     * @return the cidade
     */
    public CidadeEntity getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(CidadeEntity cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the doenca
     */
    public String getDoenca() {
        return doenca;
    }

    /**
     * @param doenca the doenca to set
     */
    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }
    
    
    
}
