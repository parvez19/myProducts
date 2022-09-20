package com.example.products.service;

import com.example.products.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<Product,Integer> {
}
