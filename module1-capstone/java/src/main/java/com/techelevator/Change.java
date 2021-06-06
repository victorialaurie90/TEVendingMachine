package com.techelevator;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Change {
    private double balance1;
    private int quarters;
    private int dimes;
    private int nickels;

    public void giveChange (BigDecimal balance) {
        balance1 = (balance.doubleValue() * 100);
        quarters = ((int) balance1 / 25);
        balance1 = balance1 - (quarters * 25);
        dimes = ((int) balance1 / 10);
        balance1 = balance1 - (dimes * 10);
        nickels = (int) Math.round(balance1 / 5);

        System.out.println("**** CHANGED RETURNED ****");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
    }
}