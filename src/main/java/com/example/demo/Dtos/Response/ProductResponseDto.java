package com.example.demo.Dtos.Response;

import com.example.demo.Models.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponseDto {
    private String productName;
    private Category productCategory;
    private int productPrice;
}
