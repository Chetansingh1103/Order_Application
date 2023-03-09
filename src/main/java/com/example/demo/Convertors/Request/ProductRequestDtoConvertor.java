package com.example.demo.Convertors.Request;

import com.example.demo.Dtos.Request.ProductRequestDto;
import com.example.demo.Dtos.Request.UserRequestDto;
import com.example.demo.Models.Product;
import com.example.demo.Models.User;

public class ProductRequestDtoConvertor {
    public static Product convertDtoToEntity(ProductRequestDto productRequestDto){

        return Product.builder()
                .name(productRequestDto.getName())
                .category(productRequestDto.getCategory())
                .price(productRequestDto.getPrice())
                .build();

    }
}
