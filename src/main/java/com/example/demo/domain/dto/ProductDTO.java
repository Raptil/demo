package com.example.demo.domain.dto;


import lombok.Data;

@Data
public class ProductDTO {

    private int productId;
    private String name;
    private int cost;
    private String category;
}
