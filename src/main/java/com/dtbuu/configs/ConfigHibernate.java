/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.configs;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import static org.hibernate.cfg.Environment.*;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

/**
 *
 * @author Buu Duong Tan
 */
@Configuration
@PropertySource("classpath:databases.properties")
public class ConfigHibernate {
    @Autowired
    private Environment env;
    
    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
        lsfb.setPackagesToScan("com.dtbuu.pojos");
        lsfb.setDataSource(dataSource());
        lsfb.setHibernateProperties(hibernateProperties());
        
        return lsfb;
    }
    
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dmds = new DriverManagerDataSource();
        dmds.setDriverClassName(env.getProperty("hibernate.connection.driverClass"));
        dmds.setUrl(env.getProperty("hibernate.connection.url"));
        dmds.setUsername(env.getProperty("hibernate.connection.username"));
        dmds.setPassword(env.getProperty("hibernate.connection.password"));
        
        return dmds;
    }
    
    
    public Properties hibernateProperties() {
        Properties props = new Properties();
        props.setProperty(DIALECT, env.getProperty("hibernate.dialect"));
        props.setProperty(SHOW_SQL, env.getProperty("hibernate.showSql"));
        
        return props;
    }
    
    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager htm = new HibernateTransactionManager();
        htm.setSessionFactory(getSessionFactory().getObject());
        
        
        return htm;
    }
}
