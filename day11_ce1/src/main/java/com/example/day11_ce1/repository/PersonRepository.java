package com.example.day11_ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day11_ce1.model.Person;

public interface PersonRepository extends JpaRepository<Person,Integer>{

}
