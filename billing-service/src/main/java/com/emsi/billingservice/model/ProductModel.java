package com.emsi.billingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ProductModel {
    private Long id;
    private String name;
    private double price;
    private double quantity;
}
