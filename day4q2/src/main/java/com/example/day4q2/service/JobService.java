package com.example.day4q2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4q2.model.Job;
import com.example.day4q2.repository.JobRepo;

@Service
public class JobService {

    @Autowired
    JobRepo jr;
    public Job saveJob(Job j)
    {
        return jr.save(j);
    }
    
}
