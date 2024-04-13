package com.example.day2pah.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day2pah.config.Department;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DeparmentController {

     @GetMapping("/student")
     public Department getMethodName() {
          Department d = new Department("Information technology-B", "IT");
          return d;
     }

}
