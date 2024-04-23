package com.example.day6_ce_1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6_ce_1.model.Children;
import com.example.day6_ce_1.repository.ChildrenRepo;
import com.example.day6_ce_1.services.ChildrenService;

@RestController
public class ChildrenContoller {

    @Autowired
    ChildrenRepo cr;
    @Autowired
    ChildrenService cs;
    @PostMapping("/api/children")
    public Children showall(@RequestBody Children c)
    {
        return cs.showinfor(c);
    } 
    @GetMapping("/api/children/sortby/{babyId}")
    public Optional<Children> getall(@PathVariable int id)
    {
        return cs.getorder(id);
    } 

    



}
