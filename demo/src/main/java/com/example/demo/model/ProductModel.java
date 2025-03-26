package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@With
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Document("Product")
public class ProductModel {
    @Id
    private String  id;
    private String name;
    private boolean isSold;
}
