package com.example.demo.Repositories;

import com.example.demo.Models.Category;
import com.example.demo.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query(value = "select * from products where name like 'A%' ",nativeQuery = true)
    List<Product> productsNameStartsWithA();
    @Query(value = "select * from products order by price desc where category=:category limit 1 ",nativeQuery = true)
    Product getProductWithMaxPrice(Category category);
    @Query(value = "select * from products order by numberOfTimesBought desc, price desc limit 1",nativeQuery = true)
    Product getMostOrderedProduct();
}
