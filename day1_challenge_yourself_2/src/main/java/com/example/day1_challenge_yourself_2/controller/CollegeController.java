package com.example.day1_challenge_yourself_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day1_challenge_yourself_2.model.College;

@RestController
public class CollegeController {

    @GetMapping("/college")
    public College getAll()
    {
        College c=new College("Skcet", "CSE", 1);
        return c;
    }

}
