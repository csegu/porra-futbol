/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csg.proyectoporra.configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 *
 * @author Cristian Segura <jordison@gmail.com>
 */
public class Configuration_ {

    //@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
