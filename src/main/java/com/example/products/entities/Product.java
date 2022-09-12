package com.example.products.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Product {
    private String productName;
    private int modelYear;
}
