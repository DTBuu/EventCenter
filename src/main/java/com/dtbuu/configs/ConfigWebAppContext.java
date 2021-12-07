/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.configs;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.dtbuu.formatter.LoginFormatter;
import com.dtbuu.formatter.ViTriFormatter;
import com.dtbuu.validators.HallNameValidator;
import com.dtbuu.validators.WebAppValidator;
import java.util.HashSet;
import java.util.Set;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Buu Duong Tan
 */
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.dtbuu.controllers",
    "com.dtbuu.repositories",
    "com.dtbuu.services",
    "com.dtbuu.validators",})
public class ConfigWebAppContext implements WebMvcConfigurer {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/");
        registry.addResourceHandler("/img/**").addResourceLocations("/resources/img/");
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());

        return bean;
    }

    @Override
    public org.springframework.validation.Validator getValidator() {
        return validator();
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new LoginFormatter());
        registry.addFormatter(new ViTriFormatter());
    }

    @Bean
    public WebAppValidator diadiemtochucValidator() {
        Set<Validator> springValidators = new HashSet<>();
        springValidators.add(new HallNameValidator());

        WebAppValidator v = new WebAppValidator();
        v.setSpringValidator(springValidators);

        return v;
    }

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        irvr.setViewClass(JstlView.class);
        irvr.setPrefix("/WEB-INF/jsp/");
        irvr.setSuffix(".jsp");

        return irvr;
    }

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setDefaultEncoding("UTF-8");

        return resolver;
    }

    @Bean
    public Cloudinary cloudinary() {
        Cloudinary c = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "springweb",
                "api_key", "264919483341848",
                "api_secret", "-pD3kyVsldOX4Tpw6-rGv5IUi1A",
                "secure", true
        ));
        return c;
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();
        rbms.setBasename("messages");
        return rbms;
    }
}
