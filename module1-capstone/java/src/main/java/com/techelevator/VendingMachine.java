package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class VendingMachine {

    // Create balance = Big Decimal
    BigDecimal balance = new BigDecimal(0.00).setScale(2);

    //TODO Create a List = Purchase List
    //TODO Create inventory = Map
    //TODO Declare a Log Writer(Worry about lastly)

    public void feedMoney(int addMoney) {
        String typeOfTransaction = "FEED MONEY:";
        if (addMoney == 1) {
            balance = balance.add(new BigDecimal((1.00)));
            //TODO add code to write to LogWriter

        } else if (addMoney == 2) {
            balance = balance.add(new BigDecimal((2.00)));

        } else if (addMoney == 3) {
            balance = balance.add(new BigDecimal((5.00)));


        }else if (addMoney == 4) {
            balance = balance.add(new BigDecimal((10.00)));//Method to complete transaction
            //Method to purchase
        }
        System.out.println("Your balance is " + balance + ".");
    }

    //Method to display inventory
    //Method to feed money

}