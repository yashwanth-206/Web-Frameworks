package com.example.day11_ce1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day11_ce1.model.Person;
import com.example.day11_ce1.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    PersonRepository pr;
    public Person setAll(Person p)
    {
        return pr.save(p);
    }

    public List<Person> getAll(Person p)
    {
        return pr.findAll();
    }

    public Optional<Person> getThat(int id,Person p)
    {
        return pr.findById(id);
    }
}
