package com.example.day4q3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day4q3.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

}
