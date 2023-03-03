package com.cydeo.stereotype_annotations.model;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class DataStructure {

   private final ExtraHours extraHours;



    public void getTotalHours(){
        System.out.println("Total hours: " + (35 + extraHours.getHours()));
    }


}
