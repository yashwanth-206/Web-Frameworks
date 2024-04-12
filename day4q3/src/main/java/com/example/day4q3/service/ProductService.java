package com.example.day4q3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4q3.model.Product;
import com.example.day4q3.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo pr;
    public Product saveall(Product p)
    {
        return pr.save(p);
    }
    public List<Product> dis()
    {
        return pr.findAll();
    }
    public Optional<Product>findby(int id)
    {
        return pr.findById(id);
    }
    public Product change(Product p)
    {
        return pr.save(p);
    }

}
