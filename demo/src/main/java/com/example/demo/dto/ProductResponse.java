package com.example.demo.dto;

import com.example.demo.model.ProductModel;
import lombok.Builder;

@Builder
public record ProductResponse(String id, String status) {
    public static ProductResponse from(ProductModel productModel) {
        return ProductResponse.builder()
                .id(productModel.getId())
                .status("foo")
                .build();
    }
}
