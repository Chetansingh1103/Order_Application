package com.example.demo.Services.Impl;

import com.example.demo.Convertors.Request.ProductRequestDtoConvertor;
import com.example.demo.Convertors.Response.ProductToProductResponseDtoConvertor;
import com.example.demo.Dtos.Request.ProductRequestDto;
import com.example.demo.Dtos.Response.ProductResponseDto;
import com.example.demo.Models.Category;
import com.example.demo.Models.Product;
import com.example.demo.Repositories.ProductRepository;
import com.example.demo.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public String addProduct(ProductRequestDto productRequestDto) {

        Product product = ProductRequestDtoConvertor.convertDtoToEntity(productRequestDto);
        product.setNumberOfTimesBought(0);
        productRepository.save(product);

        return "Product has been added";
    }

    @Override
    public ProductResponseDto getMaxPriceProduct(Category category) {

        Product product = productRepository.getProductWithMaxPrice(category);

        return ProductToProductResponseDtoConvertor.convertEntityToResponseDto(product);
    }

    @Override
    public ProductResponseDto getMostOrderedProduct() {

        Product product = productRepository.getMostOrderedProduct();

        return ProductToProductResponseDtoConvertor.convertEntityToResponseDto(product);

    }

}
