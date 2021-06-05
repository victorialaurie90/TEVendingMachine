package com.techelevator;

import org.junit.Assert;
import java.math.BigDecimal;
import org.junit.Test;

public class ChipsTests {
    Chips chips;

    @Test
    public void testChips_returnCorrectNameAndPrice() {
        Chips chips = new Chips("Fritos", new BigDecimal(1.00).setScale(2));
        Assert.assertEquals("Fritos", chips.getName() );
        Assert.assertEquals("1.00", chips.getPrice().toString());
    }
}
