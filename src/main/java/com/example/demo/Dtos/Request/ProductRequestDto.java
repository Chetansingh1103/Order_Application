package com.example.demo.Dtos.Request;

import com.example.demo.Models.Category;
import lombok.Data;

@Data
public class ProductRequestDto {
    private String name;
    private Category category;
    private int price;
}
