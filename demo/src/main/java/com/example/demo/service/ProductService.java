package com.example.demo.service;

import com.example.demo.model.ProductModel;
import com.example.demo.repo.ProductRepo;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService (ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    public String returnTest (){return "Hello World";}

    public ProductModel addProduct (ProductModel product) {
        return productRepo.save(product);
    }
}
