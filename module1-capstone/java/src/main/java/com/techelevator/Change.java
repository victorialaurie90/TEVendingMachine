package com.techelevator;

import java.math.BigDecimal;

public class Change {
    private double balance1;
    private int quarters1;
    private int dimes1;
    private int nickels1;

    public void giveChange (BigDecimal balance) {
        balance1 = (balance.doubleValue() * 100);
        quarters1 = ((int) balance1 / 25);
        balance1 = balance1 - (quarters1 * 25);
        dimes1 = ((int) balance1 / 10);
        balance1 = balance1 - (dimes1 * 10);
        nickels1 = ((int) balance1 / 5);

        System.out.println("Changed returned: " + quarters1 + " quarters and "
                            + dimes1 + " dimes and " + nickels1 + " nickels.");
    }
}
