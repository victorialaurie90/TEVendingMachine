package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Product {

    public Chips (String name, BigDecimal price) {
        super(name, price);
    }

    public String getSound() {
        return "Crunch Crunch, Yum!";
    }
}