package com.example.day11_ce1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day11_ce1.model.Person;
import com.example.day11_ce1.service.PersonService;

@RestController
public class PersonController {

    @Autowired
    PersonService ps;

    @PostMapping("/person")
    public Person setInfo(@RequestBody Person p)
    {
        return ps.setAll(p);
    }
    @GetMapping("/person")
    public List<Person> getAll(Person p)
    {
        return ps.getAll(p);
    }

    @GetMapping("/person/{personId}")
    public Optional<Person> getThat(@PathVariable int id,Person p)
    {
        return ps.getThat(id, p);
    }
}
