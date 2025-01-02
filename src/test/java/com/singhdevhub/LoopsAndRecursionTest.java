package com.singhdevhub;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singhdevhub.assignments.LoopsAndRecursion;

public class LoopsAndRecursionTest {
   
    private LoopsAndRecursion lnr;
    private ByteArrayOutputStream outputStream;
    private PrintStream printStream;
    
    @BeforeEach
    public void init(){
        lnr = new LoopsAndRecursion();
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }

    @Test
    public void printStarPattern(){
        lnr.printStarPattern();
        String expected = "*\n**\n***\n****\n*****\n******\n*******\n********\n*********";
        String actual = outputStream.toString().trim();
        assert(expected.equals(actual));
    }

    @Test
    public void calculateSum(){
        BigDecimal expected = new BigDecimal(15);
        BigDecimal actual = lnr.calculateSum(5);
        assert(expected.equals(actual));
    }

    @Test
    public void calculateFactorial(){
        BigDecimal expected = new BigDecimal(120);
        BigDecimal actual = lnr.calculateFactorial(5);
        assert(expected.equals(actual));
    }

}