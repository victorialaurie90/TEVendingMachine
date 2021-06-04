package com.techelevator;

import java.math.BigDecimal;
import java.util.*;

public class VendingMachine {

    BigDecimal balance = new BigDecimal(0.00).setScale(2);
    List <Product> purchaseList = new ArrayList<>();
    SortedMap<String, List<Product>> inventory = new TreeMap<>();

    public VendingMachine(SortedMap<String, List<Product>> inventory) {
        this.inventory = inventory;
    }

    //TODO: Declare a Log Writer(Worry about lastly)

    // Method to display inventory
    public void displayInventory() {
        for (Map.Entry<String, List<Product>> entry: inventory.entrySet()) {
            String key = entry.getKey();
            List value = entry.getValue();

            if (value.size() == 1) {
                System.out.println(key + "is out of stock.");
            } else {
                System.out.println(key + " | " + value.get(0) + " | Quantity: " + (value.size() - 1));
            }
        }
    }

    // Method to select product
    public void purchase(String guestSelection) {
        if (!inventory.containsKey(guestSelection)) {
            System.out.println("This product does not exist. Please select a product in the vending machine.");
        }
        if (inventory.containsKey(guestSelection)) {
            if (inventory.get(guestSelection).size() == 1) {
                System.out.println("Item is out of stock.");
            }
            if (inventory.get(guestSelection).size() >= 1) {
                if (balance.compareTo(inventory.get(guestSelection).get(0).price) >= 0) {
                    balance = balance.subtract(inventory.get(guestSelection).get(0).price);
                    Product purchasedProduct = inventory.get(guestSelection).remove(0);

                    System.out.println(inventory.get(guestSelection).get(0));
                    System.out.println(purchasedProduct.getSound());

                    /*TODO: purchaseList.add(purchasedProduct);
                    Product cost = inventory.get(guestSelection).get(1);
                    BigDecimal cost1 = cost.price;
                    Product name1 = inventory.get(guestSelection).get(0);
                    String product1 = name1.name + " " + guestSelection;
                    TODO: writer.writer(product1, cost1, balance);*/
                }
                else {
                    System.out.println("Insufficient funds");
                }
            }
        }
        System.out.println("Your balance is " + balance + ".");
    }

    public void completeTransaction() {
        Change thisChange = new Change();
        thisChange.giveChange(balance);
        balance = new BigDecimal(0).setScale(2);
        //TODO: writer("GIVE CHANGE:", balance, new BigDecimal(0.00).setScale(2));
        while (purchaseList.size() > 0) {
            Product purchases = purchaseList.remove(0);
            //System.out.println(purchases.getSound());
        }
    }


    //Method to feed money
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

        }
        System.out.println("Your balance is " + balance + ".");
    }

    //TODO: Method to finish transaction
}