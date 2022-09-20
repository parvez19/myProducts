package com.example.products.service;

import com.example.products.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService{

    @Autowired
    ProductsRepo productsRepo;
    @Override
    public List<Product> getProductList() {
        return productsRepo.findAll();
    }

    @Override
    public List<Product> getIphoneData() {
        List<Product> dbResponse = productsRepo.findAll();
        List<Product> finalResponse = new ArrayList<>();
        dbResponse.forEach(x -> {
            if(x.getProductName().contains("iphone")) {
                finalResponse.add(x);
            }
        });

        return finalResponse;
    }


}
