package com.example.day5pah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day5pah.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
