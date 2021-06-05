package com.techelevator;

import  org.junit.Assert;
import java.math.BigDecimal;
import org.junit.Test;

public class GumTests {
    Gum gum;

    @Test
    public void testGum_returnCorrectNameAndPrice() {
        Gum gum = new Gum("WinterFresh", new BigDecimal(1.50).setScale(2));
        Assert.assertEquals("WinterFresh", gum.getName() );
        Assert.assertEquals("1.50", gum.getPrice().toString());
    }
}
