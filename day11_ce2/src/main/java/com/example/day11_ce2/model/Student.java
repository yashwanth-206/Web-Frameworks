package com.example.day11_ce2.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

    @Id
    Long id;
    String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="IdCard_id")
    StudentIdCard sicd;
    
    public Student (){}
    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public StudentIdCard getSicd() {
        return sicd;
    }
    public void setSicd(StudentIdCard sicd) {
        this.sicd = sicd;
    }

    
}
