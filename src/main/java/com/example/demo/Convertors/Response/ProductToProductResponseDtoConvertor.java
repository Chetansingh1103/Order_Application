package com.example.demo.Convertors.Response;

import com.example.demo.Dtos.Response.ProductResponseDto;
import com.example.demo.Models.Product;

public class ProductToProductResponseDtoConvertor {
    public static ProductResponseDto convertEntityToResponseDto(Product product){
        return ProductResponseDto.builder()
                .productName(product.getName())
                .productCategory(product.getCategory())
                .productPrice(product.getPrice())
                .build();
    }
}
