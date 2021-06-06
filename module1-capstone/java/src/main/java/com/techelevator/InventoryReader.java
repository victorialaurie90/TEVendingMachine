package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

public class InventoryReader {

    public SortedMap<String, List<Product>> fileImporter() {
        File inventoryFile = new File("C:/Users/Student/workspace/green-mod1-capstone-team0/module1-capstone/java/vendingmachine.csv");

        SortedMap<String, List<Product>> vendingMachineInventory = new TreeMap<>();

        try (Scanner inventoryImporter = new Scanner(inventoryFile)) {
            while (inventoryImporter.hasNextLine()) {
                String line = inventoryImporter.nextLine();
                if (!line.isEmpty()) {
                    String[] inventoryImportArray = line.split("\\|");

                    if (inventoryImportArray[0].contains("A")) {
                        List<Product> chipArray = new ArrayList<>();
                        for (int i = 0; i <= 5; i++) {
                            Chips temp = new Chips(inventoryImportArray[1], new BigDecimal(inventoryImportArray[2]));
                            chipArray.add(temp);
                        }
                        vendingMachineInventory.put(inventoryImportArray[0], chipArray);

                    } else if (inventoryImportArray[0].contains("B")) {
                        List<Product> candyArray = new ArrayList<>();
                        for (int i = 0; i <= 5; i++) {
                            Candy temp = new Candy(inventoryImportArray[1], new BigDecimal(inventoryImportArray[2]));
                            candyArray.add(temp);

                        }
                        vendingMachineInventory.put(inventoryImportArray[0], candyArray);

                    } else if (inventoryImportArray[0].contains("C")) {
                        List<Product> drinkArray = new ArrayList<>();
                        for (int i = 0; i <= 5; i++) {
                            Drink temp = new Drink(inventoryImportArray[1], new BigDecimal(inventoryImportArray[2]));
                            drinkArray.add(temp);
                        }
                        vendingMachineInventory.put(inventoryImportArray[0], drinkArray);

                    } else {
                        List<Product> gumArray = new ArrayList<>();
                        for (int i = 0; i <= 5; i++) {
                            Gum temp = new Gum(inventoryImportArray[1], new BigDecimal(inventoryImportArray[2]));
                            gumArray.add(temp);
                        }
                        vendingMachineInventory.put(inventoryImportArray[0], gumArray);
                    }
                }
            }
            return vendingMachineInventory;

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(1);
            return vendingMachineInventory;
        }
    }
}
