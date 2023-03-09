package com.example.demo.Services;

import com.example.demo.Dtos.Request.ProductRequestDto;
import com.example.demo.Dtos.Response.ProductResponseDto;
import com.example.demo.Models.Category;
import com.example.demo.Models.Product;

public interface ProductService {
    String addProduct(ProductRequestDto productRequestDto);
    ProductResponseDto getMaxPriceProduct(Category category);
    ProductResponseDto getMostOrderedProduct();
}
