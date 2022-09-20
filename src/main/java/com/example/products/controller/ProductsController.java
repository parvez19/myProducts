package com.example.products.controller;


import com.example.products.entities.Product;
import com.example.products.service.ProductService;
import com.example.products.service.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    ProductService service;

    @GetMapping("/apple/products")
    public List<Product> getProducts() {
        return service.getProductList();
    }

    @GetMapping("/apple/iphone")
    public List<Product> getIphones() {
        return service.getIphoneData();
    }
}
