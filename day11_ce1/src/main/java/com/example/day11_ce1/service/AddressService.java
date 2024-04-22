package com.example.day11_ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day11_ce1.model.Address;
import com.example.day11_ce1.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    AddressRepository ar;

    public Address setALL(int id,Address a)
    {
        return ar.save(a);
    }
}
