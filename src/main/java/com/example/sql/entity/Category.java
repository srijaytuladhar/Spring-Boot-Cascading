package com.example.sql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    // @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
     //private List<Product> products;
}
