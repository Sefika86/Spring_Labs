package com.cydeo.stereotype_annotations;

import com.cydeo.stereotype_annotations.config.CourseConfig;
import com.cydeo.stereotype_annotations.model.DataStructure;
import com.cydeo.stereotype_annotations.model.ExtraHours;
import com.cydeo.stereotype_annotations.model.Microservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class CourseApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(CourseConfig.class);

        DataStructure ds = container.getBean(DataStructure.class);
        ds.getTotalHours();

        Microservice ms = container.getBean(Microservice.class);
        ms.getTotalHours();

        ExtraHours extraHours = container.getBean(ExtraHours.class);
        System.out.println(extraHours.getHours());

    }
}
