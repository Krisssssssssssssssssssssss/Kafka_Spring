package com.example.demo.controller;

import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;
import com.example.demo.model.ProductModel;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    private  ProductService productService;
    private ProductModel productModel;
    public ProductController (ProductService productService, ProductModel productModel) {
        this.productService = productService;
        this.productModel = productModel;
    }

    @GetMapping
    public String testGet (){
        ProductModel model = new ProductModel();
        model.setName("prod");
        return productService.returnTest();
    }
    @PostMapping
    public ProductResponse addProduct (@RequestBody ProductRequest productRequest) {
        ProductModel model = productRequest.toModel();
        return ProductResponse.from(productService.addProduct(model));
    }
}
