package com.cydeo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Customer extends BaseEntity {


    private String firstName;
    private String lastName;
    private String userName;
    private String email;


//If there is no reason ,I want to keep my Customer class clean, I don't want to put foreign key relation

}
