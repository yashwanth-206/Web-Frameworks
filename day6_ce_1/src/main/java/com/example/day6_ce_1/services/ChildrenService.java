package com.example.day6_ce_1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day6_ce_1.model.Children;
import com.example.day6_ce_1.repository.ChildrenRepo;

@Service
public class ChildrenService {

    @Autowired
    ChildrenRepo cr;
    public Children showinfor(Children c)
    {
        return cr.save(c);
    }
    public Optional<Children> getorder(int id)
    {
        return cr.findById(id);
    }
}
