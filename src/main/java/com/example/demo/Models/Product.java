package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(value = EnumType.STRING)
    private Category category;
    private int price;
    private int numberOfTimesBought = 0;
    @ManyToMany(mappedBy = "productList",cascade = CascadeType.ALL)
    List<Order> orderList = new ArrayList<>();
}
