package com.example.day11_ce2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day11_ce2.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
