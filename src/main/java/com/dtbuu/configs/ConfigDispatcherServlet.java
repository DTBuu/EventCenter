/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author Buu Duong Tan
 */
public class ConfigDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { ConfigHibernate.class,
                             ConfigTiles.class,
                             ConfigSpringSecurity.class
                           };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {ConfigWebAppContext.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
    
}
