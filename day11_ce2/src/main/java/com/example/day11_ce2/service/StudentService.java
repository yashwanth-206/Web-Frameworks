package com.example.day11_ce2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day11_ce2.repository.StudentIDRepository;
import com.example.day11_ce2.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository sr;

    @Autowired
    StudentIDRepository sidr;
}
