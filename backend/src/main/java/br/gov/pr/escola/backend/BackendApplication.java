package br.gov.pr.escola.backend;

import br.gov.pr.escola.backend.entity.CidadeEntity;
import br.gov.pr.escola.backend.entity.ConsultaEntity;
import br.gov.pr.escola.backend.entity.MedicoEntity;
import br.gov.pr.escola.backend.entity.PacienteEntity;
import br.gov.pr.escola.backend.service.CidadeService;
import br.gov.pr.escola.backend.service.ConsultaService;
import br.gov.pr.escola.backend.service.MedicoService;
import br.gov.pr.escola.backend.service.PacienteService;
import java.sql.Date;
import java.sql.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {

    private static final Logger log = LoggerFactory.getLogger(BackendApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CidadeService cidadeService, ConsultaService consultaService,
            MedicoService medicoService, PacienteService pacienteService) {

        return (arg) -> {

            /*CidadeEntity cidade1 = new CidadeEntity();
                
                cidade1.setNome("Vitorino");
                cidade1.setUf("PR");
                
                log.info("===============================");
                log.info("========== Fazendo persistencia na tabela cidade no banco dbhospital ==========");
                log.info("==============================");
                cidade1 = cidadeService.save(cidade1);
                
                log.info("========== Registro salvo com sucesso! ==========");
                log.info(" ");
                log.info("ID da cidade1: " + cidade1.getId());
                log.info("Nome da cidade1: " + cidade1.getNome());
                log.info("UF da cidade 1: " + cidade1.getUf());*/
 /*log.info("===============================");
            log.info("========== Listando TODAS as cidades da tabela cidade do banco dbhospital ==========");
            log.info("==============================");

            for (CidadeEntity cidade : cidadeService.findAll()) {
                log.info("ID da cidade: " + cidade.getId());
                log.info("Nome da cidade: " + cidade.getNome());
                log.info("UF da cidade: " + cidade.getUf());
                log.info(" ");
            }*/
 /*log.info("===============================");
            log.info("========== Consultando cidade pelo ID no banco dbhospital ==========");
            log.info("==============================");
            
            CidadeEntity cidade = cidadeService.getById(7l);
            
            log.info("ID da cidade: " + cidade.getId());
            log.info("Nome da cidade: " + cidade.getNome());
            log.info("UF da cidade: " + cidade.getUf());*/
 /*log.info("===============================");
            log.info("========== Deletando cidade pelo ID no banco dbhospital ==========");
            log.info("==============================");
            
            cidadeService.deleteById(8l);*/
            /*log.info("===============================");
            log.info("========== Consultando medico pelo ID no banco dbhospital ==========");
            log.info("==============================");

            MedicoEntity medico = medicoService.getById(1l);
            PacienteEntity paciente = pacienteService.getById(4l);

            ConsultaEntity consulta = new ConsultaEntity();
            
            //consulta.setData(LocalDate.of(2025, 8, 28)); // Com LocalDate
            consulta.setData(Date.valueOf("2025-08-28"));
            consulta.setHora(new Time(10, 30, 0));
            consulta.setMedico(medico);
            consulta.setPaciente(paciente);

            log.info("===============================");
            log.info("========== Fazendo persistencia na tabela consulta no banco dbhospital ==========");
            log.info("==============================");
            
            consulta = consultaService.save(consulta);
            
            
            log.info("===============================");
            log.info("========== Retornando dados da consulta cadastrada ==========");
            log.info("==============================");
            
            log.info("Data da consulta: " + consulta.getData());
            log.info("Hora da consulta: " + consulta.getHora());
            log.info("Medico: " + consulta.getMedico().getNome());
            log.info("Paciente: " + consulta.getPaciente().getNome());*/
            
            /*for (ConsultaEntity consulta : consultaService.buscarConsultasMedicoJoao()) {
                log.info("");
                log.info("Data da consulta: " + consulta.getData());
                log.info("Hora da consulta: " + consulta.getHora());
                log.info("Medico: " + consulta.getMedico().getNome());
                log.info("Paciente: " + consulta.getPaciente().getNome());
            }*/
            
            /*for (ConsultaEntity consulta : consultaService.buscarConsultasMedico("Carlos")) {
                log.info("");
                log.info("Data da consulta: " + consulta.getData());
                log.info("Hora da consulta: " + consulta.getHora());
                log.info("Medico: " + consulta.getMedico().getNome());
                log.info("Paciente: " + consulta.getPaciente().getNome());
            }*/
            
        };

    }

}
