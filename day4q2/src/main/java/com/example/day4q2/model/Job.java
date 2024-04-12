package com.example.day4q2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int jobid;
    String jobTitle;
    int minSalary;
    String jobDescrip;
    int maxSalary;
    public Job(){}
    public Job(int jobid, String jobTitle, int minSalary, String jobDescrip, int maxSalary) {
        this.jobid = jobid;
        this.jobTitle = jobTitle;
        this.minSalary = minSalary;
        this.jobDescrip = jobDescrip;
        this.maxSalary = maxSalary;
    }
    public int getJobid() {
        return jobid;
    }
    public void setJobid(int jobid) {
        this.jobid = jobid;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public int getMinSalary() {
        return minSalary;
    }
    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }
    public String getJobDescrip() {
        return jobDescrip;
    }
    public void setJobDescrip(String jobDescrip) {
        this.jobDescrip = jobDescrip;
    }
    public int getMaxSalary() {
        return maxSalary;
    }
    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    
}
