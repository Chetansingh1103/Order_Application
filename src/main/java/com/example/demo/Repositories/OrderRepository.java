package com.example.demo.Repositories;

import com.example.demo.Models.Order;
import com.example.demo.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
