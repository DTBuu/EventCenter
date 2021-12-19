/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.configs;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.dtbuu.configs.handlers.LoginSuccessHandler;
import com.dtbuu.configs.handlers.LogoutHandler;
import com.dtbuu.pojos.Logins;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Buu Duong Tan
 */
@Configuration
@EnableWebSecurity
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.dtbuu.repositories",
    "com.dtbuu.services"
})
public class ConfigSpringSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private AuthenticationSuccessHandler loginSuccessHandler;
    @Autowired
    private LogoutSuccessHandler logoutSuccessHandler;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
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
    public AuthenticationSuccessHandler loginSuccessHandler() {
        return new LoginSuccessHandler();
    }

    @Bean
    public LogoutSuccessHandler logoutSuccessHandler() {
        return new LogoutHandler();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/sign-in").usernameParameter("Login_user").passwordParameter("Login_pass");
        http.formLogin().defaultSuccessUrl("/HomeManager").failureUrl("/sign-in?fail");
        http.formLogin().successHandler(this.loginSuccessHandler);
//        http.logout().logoutSuccessUrl("/sign-in");
        http.logout().logoutSuccessHandler(this.logoutSuccessHandler);
        //
        http.exceptionHandling()
                .accessDeniedPage("/sign-in?accessDenied");
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/admin/**").access("hasRole('ROLE_MANAGER')")
                .antMatchers("/bookingEvent/**").access("hasRole('ROLE_GUEST')");

        
                
                
        http.csrf().disable();
    }
}
