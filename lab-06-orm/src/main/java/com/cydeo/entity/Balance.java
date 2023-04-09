package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Balance {

    private BigDecimal amount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;


    public Balance(BigDecimal amount) {
        this.amount = amount;
    }
}
