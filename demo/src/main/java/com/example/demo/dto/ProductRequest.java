package com.example.demo.dto;

import com.example.demo.model.ProductModel;
import lombok.NonNull;

public record ProductRequest(@NonNull String name, int quntity) {
    public ProductModel toModel(){
        return ProductModel.builder()
                .name(name)
                .isSold(true)
                .build();
    }
}
