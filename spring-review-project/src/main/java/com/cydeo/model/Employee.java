package com.cydeo.model;

import lombok.Data;

//@Getter
//@Setter
//@AllArgsConstructor or instead of these put @Data & final fields
@Data
//No @Component here because we don't make the model classes beans usually
//Since the model classes represent some application data, for example Employee,
//that information will be coming from UI side that's why we do not let Spring manage those beans for us
public class Employee {

    private final String name;
    private final String department;
    private final int hourlyRate;


    //as long as the fields are final, the RequiredArgsConstructor inside the @Data will do the same job,
    // but if they are not final
    // we either need the regular way with all args or @NonNull on top of not final fields with @Data
}
