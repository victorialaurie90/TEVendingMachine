package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import  java.time.LocalDate;
import  java.time.LocalTime;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;




public class LogWriter {
    public void writer(String typeOfTransaction, BigDecimal amount, BigDecimal balance) {
        DateFormat dayAndTime = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");

       
        try (PrintWriter logWriter = new PrintWriter(new FileOutputStream(new File("Log.txt"), true))) {

            String dayAndTimeString = dayAndTime.format(new Date()).toString();
            String printTypeOfTransaction = typeOfTransaction;
            String printAmount = amount.toString();
            String printBalance = balance.toString();

            logWriter.println(dayAndTimeString + " " + printTypeOfTransaction
                    + String.format( "$" + printAmount) + " " + String.format("$" + printBalance));


        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}
