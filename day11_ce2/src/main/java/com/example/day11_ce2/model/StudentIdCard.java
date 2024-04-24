package com.example.day11_ce2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentIdCard {

    @Id
    Long id;
    String cardNumber;

    public StudentIdCard(){}

    public StudentIdCard(Long id, String cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
}
