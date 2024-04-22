package com.example.day11_ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day11_ce1.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
