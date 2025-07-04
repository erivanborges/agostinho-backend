/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.config;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Administrador
 */
@Configuration
@EnableJpaRepositories("br.gov.pr.escola.backend.repository")
@EnableTransactionManagement
public class SpringDataConfig {
    
    @Bean
    public DataSource dataSource() {
        HikariDataSource ds = new HikariDataSource();
        
        ds.setUsername("root");
        ds.setPassword("escola");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/dbhospital");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        
        return ds;
    }
    
}
