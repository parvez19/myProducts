package com.example.products.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "productId")
    private int productId;
    @Column(name = "productName")
    private String productName;
    @Column(name = "modelYear")
    private int modelYear;
}
