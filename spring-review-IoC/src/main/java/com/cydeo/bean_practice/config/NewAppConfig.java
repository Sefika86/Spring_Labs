package com.cydeo.bean_practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewAppConfig {

    @Bean(name = "Welcome")
    public String str1(){
        return "Welcome to CourseApp";
    }

    @Bean //since we did not define a custom name, the default bean name will be the method name which is str2
    public String str2(){
        return "String Core Practice";
    }
}
