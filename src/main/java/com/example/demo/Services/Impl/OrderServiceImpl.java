package com.example.demo.Services.Impl;

import com.example.demo.Models.Order;
import com.example.demo.Models.PaymentMode;
import com.example.demo.Models.Product;
import com.example.demo.Repositories.OrderRepository;
import com.example.demo.Repositories.ProductRepository;
import com.example.demo.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductRepository productRepository;
    @Override
    public String createOrder() {

        List<Product> productList = productRepository.productsNameStartsWithA();

        Order order = new Order();
        order.setPaymentMode(PaymentMode.ONLINE);
        order.setProductList(productList);

        int total = 0;

        for(Product product : productList){
            product.setNumberOfTimesBought(product.getNumberOfTimesBought() + 1);
            total += product.getPrice();
        }

        order.setTotalPrice(total);

        orderRepository.save(order);

        return "order has been placed";
    }
}
