package com.example.demo.controller;

import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;
import com.example.demo.model.ProductModel;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.kafka.core.KafkaTemplate;

@RestController
@RequestMapping("/api")
public class ProductController {

    private  ProductService productService;
    private final KafkaTemplate<String,String> kafkaTemplate;
    private ProductModel productModel;
    public ProductController (ProductService productService, ProductModel productModel, KafkaTemplate<String,String> kafkaTemplate) {
        this.productService = productService;
        this.productModel = productModel;
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping
    public String testGet (){
        //So when this >> Send Hello to Kafka, and whoever listens to this topic, will get the Hello
        //Taken from the ProducerConfig
        kafkaTemplate.send("testTopic", "Hello Kafka");
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
