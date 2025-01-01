package com.singhdevhub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singhdevhub.assignments.WrapperAndPremitiveClasses;

public class WrapperAndPremitiveClassesTest {
    
    private WrapperAndPremitiveClasses wnpc;
    private ByteArrayOutputStream outputStream;
    private PrintStream printStream;

    @BeforeEach
    public void init(){
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        wnpc = new WrapperAndPremitiveClasses();
    }
    
    @Test
    public void workingWithBoolean(){
        wnpc.workingWithBoolean();
        String expected = "true, false, true, false, true, false, true";
        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);
    }
    
    @Test
    public void workingWithCharacter(){
        wnpc.workingWithCharacter();
        String expected = "true";
        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void workingWithInteger(){
        wnpc.workingWithInteger();
        String expected = "true";
        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void workingWithLong(){
        wnpc.workingWithLong();
        String expected = "true";
        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);

    }   

    @Test
    public void workingWithFloat(){
        wnpc.workingWithFloat();
        String expected = "true";
        String actual = outputStream.toString().trim();
        assertEquals(expected, actual); 
    }

    @Test
    public void workingWithDouble(){
        wnpc.workingWithDouble();
        String expected = "true";
        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void workingWithComparison(){
        wnpc.workingWithComparison();
        String expected = "false";
        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);
    }
    
}
