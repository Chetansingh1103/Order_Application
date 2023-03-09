package com.example.demo.Controllers;

import com.example.demo.Dtos.Request.ProductRequestDto;
import com.example.demo.Dtos.Response.ProductResponseDto;
import com.example.demo.Models.Category;
import com.example.demo.Services.Impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductServiceImpl productService;
    @PostMapping("/add") // API to add the new product into database
    public ResponseEntity<String> addProduct(@RequestBody ProductRequestDto productRequestDto){

        String response = productService.addProduct(productRequestDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/max_price") // 2nd API to get the maximum priced product for a given category
    public ResponseEntity<ProductResponseDto> getMaxPriceProduct(@RequestParam("category") Category category){

        ProductResponseDto productResponseDto = productService.getMaxPriceProduct(category);

        return new ResponseEntity<>(productResponseDto,HttpStatus.OK);
    }

    @GetMapping("/most_ordered") // 3rd API to find most ordered product (in case of multiples find the one with maximum price)
    public ResponseEntity<ProductResponseDto> getMostOrderedProduct(){
        ProductResponseDto productResponseDto = productService.getMostOrderedProduct();
        return new ResponseEntity<>(productResponseDto,HttpStatus.OK);
    }
}
