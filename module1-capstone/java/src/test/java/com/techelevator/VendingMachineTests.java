package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.math.BigDecimal;
import java.util.*;

public class VendingMachineTests {
    VendingMachine vendingMachine;
    Chips chips = new Chips("Doritos", new BigDecimal(2.00).setScale(2));
    SortedMap<String, List<Product>> inventory = new TreeMap<String, List<Product>>();
    List<Product> testProductArray = new ArrayList<>();

    @Before
    public void setUpVendingMachineStock() {
        vendingMachine = new VendingMachine(inventory);
        testProductArray.add(chips);
        testProductArray.add(chips);
        inventory.put("A1", testProductArray);
    }

    @Test
    public void feedMoneyTest_validInput4_shouldAdd10ToBalance() {
        vendingMachine.feedMoney(4);
        Assert.assertEquals(new BigDecimal(10.00).setScale(2), vendingMachine.balance);
    }

    @Test
    public void feedMoneyTest_invalidInput_balanceShouldRemainTheSame() {
        vendingMachine.feedMoney(7);
        Assert.assertEquals(new BigDecimal(0.00).setScale(2), vendingMachine.balance);
    }

    @Test
    public void purchaseTest_validInputA1_shouldReturnCorrectItem() {
        vendingMachine.feedMoney(3);
        vendingMachine.purchase("A1");
        Assert.assertEquals(new BigDecimal(3.00).setScale(2), vendingMachine.balance);
    }

    @Test
    public void purchaseTest_invalidInput_shouldReturnErrorMessageAndSameBalance() {
        vendingMachine.feedMoney(3);
        vendingMachine.purchase("X2");
        Assert.assertEquals(new BigDecimal(5.00).setScale(2), vendingMachine.balance);
    }

  @Test
    public void completeTranscationTest_shouldReturnBalanceOf0() {
        vendingMachine.feedMoney(3);
        vendingMachine.purchase("A1");
        vendingMachine.completeTransaction();
        Assert.assertEquals(new BigDecimal(0.00).setScale(2), vendingMachine.balance);
    }
}
