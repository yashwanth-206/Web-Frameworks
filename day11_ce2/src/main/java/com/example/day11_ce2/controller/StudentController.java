package com.example.day11_ce2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day11_ce2.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService ss;

    @PostMapping("/student")
    public Student putAll(Student s)
    {
        return ss.putAll(s);
    }
}
