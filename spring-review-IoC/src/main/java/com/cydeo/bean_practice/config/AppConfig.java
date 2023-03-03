package com.cydeo.bean_practice.config;

import com.cydeo.bean_practice.FullTimeEmployee;
import com.cydeo.bean_practice.PartTimeEmployee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee();
    }
    @Bean
    public PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }
}
