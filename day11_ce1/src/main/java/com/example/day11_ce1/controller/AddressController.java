package com.example.day11_ce1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day11_ce1.model.Address;
import com.example.day11_ce1.service.AddressService;

@RestController
public class AddressController {

    @Autowired
    AddressService as;

    @PostMapping("/address/person/{personId}")
    public Address setAll(@PathVariable int id, Address a)
    {
        return as.setALL(id,a);
        
    }

}
