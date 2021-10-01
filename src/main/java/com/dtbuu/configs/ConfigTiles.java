/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

/**
 *
 * @author Buu Duong Tan
 */
@Configuration
public class ConfigTiles {
    
    @Bean
    public UrlBasedViewResolver viewResolver() {
        UrlBasedViewResolver ubvr = new UrlBasedViewResolver();
        ubvr.setViewClass(TilesView.class);
        ubvr.setOrder(-2);
        return ubvr;
    }
    
    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tc = new TilesConfigurer();
        tc.setDefinitions("/WEB-INF/tiles.xml");
        tc.setCheckRefresh(true);
        return tc;
    }
}
