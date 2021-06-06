package com.techelevator;

import  org.junit.Assert;
import java.math.BigDecimal;
import org.junit.Test;

public class DrinkTests {

    @Test
    public void testDrink_shouldReturnCorrectNameAndPrice() {
        Drink drink = new Drink("Pepsi", new BigDecimal(1.50).setScale(2));
        Assert.assertEquals("Pepsi", drink.getName() );
        Assert.assertEquals("1.50", drink.getPrice().toString());
    }
}
