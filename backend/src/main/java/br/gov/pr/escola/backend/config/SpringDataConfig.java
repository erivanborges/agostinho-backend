/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.pr.escola.backend.config;

import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
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
        ds.setPassword("root");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/dbhospital");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        
        return ds;
    }
    
    @Bean
    public EntityManagerFactory entityManagerFactory() {
        
        LocalContainerEntityManagerFactoryBean factoryBean = 
                new LocalContainerEntityManagerFactoryBean();
        
        HibernateJpaVendorAdapter vendorAdapter = 
                new HibernateJpaVendorAdapter();
        
        vendorAdapter.setGenerateDdl(true);
        vendorAdapter.setShowSql(false);
        
        factoryBean.setDataSource(dataSource());
        factoryBean.setJpaVendorAdapter(vendorAdapter);
        factoryBean.setPackagesToScan("br.gov.pr.escola.backend.entity");
        factoryBean.afterPropertiesSet();
        
        return factoryBean.getObject();
    }
    
    @Bean
    public PlatformTransactionManager transactionManager() {
        
        JpaTransactionManager manager = new JpaTransactionManager();
        
        manager.setEntityManagerFactory(entityManagerFactory());
        manager.setJpaDialect(new HibernateJpaDialect());
        
        return manager;
        
    }
    
}
