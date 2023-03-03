package com.cydeo.repository;

import com.cydeo.model.Employee;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component //(ask: is a dependency or has a dependency ==>if yes put @Component)
public class DBEmployeeRepository implements EmployeeRepository {

    //assume we are getting this data from DB
    @Override
    public int getHourlyRate() {
        Employee employee = new Employee("Jessica", "development", 55);
        return employee.getHourlyRate();
    }


}
