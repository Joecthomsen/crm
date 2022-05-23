package com.crm.crm.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Item {

    @Id
    @Column(name = "itemId", nullable = false)
    private int itemId;
    private String itemName;
    private int itemQuantity;
    private float itemPrice;
    private int belongsToOrder;
}
