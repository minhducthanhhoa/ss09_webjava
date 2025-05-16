package com.data.sesson09_webjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.data.sesson09_webjava.controller",
                                "com.data.sesson09_webjava.service",
                                "com.data.sesson09_webjava.repository"
                                })
public class AppConfig {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new
                InternalResourceViewResolver();
        resolver.setPrefix("/views/");
        resolver.setSuffix(".jsp");

        return resolver;
    }
}
