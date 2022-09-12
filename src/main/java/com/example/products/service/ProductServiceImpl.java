package com.example.products.service;

import com.example.products.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService{

    @Override
    public List<Product> getProductList() {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();

        product1.setProductName("iphone");
        product1.setModelYear(2010);
        product2.setProductName("ipad");
        product2.setModelYear(2010);
        product3.setProductName("macBook14");
        product3.setModelYear(2022);
        product4.setProductName("iphone13");
        product4.setModelYear(2020);
        product5.setProductName("macBook air");
        product5.setModelYear(2020);

        List<Product> productList = Arrays.asList(product1,product2,product3,product4,product5);

        return productList;
    }
}
