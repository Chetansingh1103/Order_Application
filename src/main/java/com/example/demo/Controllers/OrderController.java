package com.example.demo.Controllers;

import com.example.demo.Repositories.OrderRepository;
import com.example.demo.Services.Impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderServiceImpl orderService;
    @PostMapping("product_name_A")  //1st API to create the order for all products with name starting with A
    public ResponseEntity<String> createOrder(){
        String response = orderService.createOrder();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
