package com.example.sql.repository;

import com.example.sql.entity.Category;
import com.example.sql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
   // @Query("SELECT * FROM Product")

    Product findByName(String name);
    public List<Product> findByCategoryName(String name);

}
