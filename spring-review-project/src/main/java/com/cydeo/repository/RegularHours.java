package com.cydeo.repository;

import org.springframework.stereotype.Component;

@Component //(ask: is a dependency or has a dependency ==>if yes put @Component)

public class RegularHours implements HoursRepository{

    @Override
    public int getHours() {
        return 40;
    }
}
