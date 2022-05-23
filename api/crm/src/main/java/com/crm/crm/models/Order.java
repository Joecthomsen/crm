package com.crm.crm.models;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Order {
    @Id
    @Column(name = "orderId", nullable = false)
    private int orderId;

    private int customerId;
    private String item;
    private Date date;
    private float price;
    
}
