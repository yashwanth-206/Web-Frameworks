package com.example.day1_challenge_1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day1_challenge_1.model.Family;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FamilyController {

     @GetMapping("/path")
     public Family getMethodName() {
          Family f = new Family("John", 20, "Brother");
          return f;
     }

}
