package com.cydeo.bean_practice;

import com.cydeo.bean_practice.config.AppConfig;
import com.cydeo.bean_practice.config.NewAppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CydeoApplication {
    public static void main(String[] args) {

   ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class, NewAppConfig.class);

        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);
        ft.createAccount();

        PartTimeEmployee pt = container.getBean(PartTimeEmployee.class);
        pt.createAccount();

        String str1 = container.getBean("Welcome", String.class);
        System.out.println("str1= " + str1);

        String str2 = container.getBean("str2",String.class);
        System.out.println("str2= " + str2);
//since we did not define a custom name, the default bean name will be the method name which is str2
    }
}
