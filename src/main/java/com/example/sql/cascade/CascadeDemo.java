package com.example.sql.cascade;

import com.example.sql.entity.Category;
import com.example.sql.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class CascadeDemo {


    public static void main(String[] args) {

        System.out.println("Casdaing is called!!");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Category category = new Category(3, "chocolate");

        Product product = new Product();
        product.setId(4);
        product.setName("kitkat");
        product.setCategory(category);


        Transaction transaction = session.beginTransaction();

        session.save(category);
        session.save(product);

        transaction.commit();

        session.close();
        factory.close();



    }

}
