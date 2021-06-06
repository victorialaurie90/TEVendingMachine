package com.techelevator;

import  org.junit.Assert;
import java.math.BigDecimal;
import org.junit.Test;

public class CandyTests {

    @Test
    public void testCandy_shouldReturnCorrectNameAndPrice() {
        Candy candy = new Candy("Reeses", new BigDecimal(1.50).setScale(2));
        Assert.assertEquals("Reeses", candy.getName() );
        Assert.assertEquals("1.50", candy.getPrice().toString());
    }
}
