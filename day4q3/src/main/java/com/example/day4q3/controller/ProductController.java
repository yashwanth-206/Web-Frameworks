package com.example.day4q3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4q3.model.Product;
import com.example.day4q3.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService ps;
    @PostMapping(path="/api/product")
    public Product save(@RequestBody Product p)
    {
       return  ps.saveall(p);
    }
    @GetMapping("/api/job")
    public List<Product> dis()
    {
        return ps.dis();
    }
    @GetMapping("/api/product/{productId}")
    public Optional<Product>show(@PathVariable int productId)
    {
        return ps.findby(productId);
    }
    @PutMapping("api/product")
    public Product change(@RequestBody Product p)
    {
        return ps.change(p);
    }
}
