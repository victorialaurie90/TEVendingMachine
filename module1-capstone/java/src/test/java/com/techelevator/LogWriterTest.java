package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LogWriterTest {
    LogWriter testLogWriter = new LogWriter();
    Scanner scanner = new Scanner("Log.txt");

    @Before
    public void setUpLogWriter() {
        testLogWriter.writer("Test Transaction: ", new BigDecimal(1.50).setScale(2), new BigDecimal (3.00).setScale(2));
    }

    @Test
    public void logWriterTest_shouldWriteToLog() {
        Assert.assertEquals(true, scanner.hasNextLine());
        scanner.nextLine();
        Assert.assertEquals(false, scanner.hasNextLine());
    }
}
