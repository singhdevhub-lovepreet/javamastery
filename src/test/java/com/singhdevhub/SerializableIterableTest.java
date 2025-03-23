package com.singhdevhub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singhdevhub.assignments.SerializableIterable;

public class SerializableIterableTest {
    
    private SerializableIterable si;
    private ByteArrayOutputStream outputStream;
    private PrintStream printStream;
    
    @BeforeEach
    public void init(){
        si = new SerializableIterable();
        outputStream= new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }

    @Test
    public void writeToFileAndThenRead() throws IOException, ClassNotFoundException{
        si.serializeAndWriteIntoFile();
        si.deserializeAndReadFromFile();
        String expected = "Ram Kumar\n20";
        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void iterableListTest(){
        si.iteratableList();
        String expected = "ram\nsham\npiyu";
        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void iterableListUsingIterator(){
        si.iteratableUsingIterator();
        String expected = "ram\nsham\npiyu";
        String actual = outputStream.toString().trim();
        assertEquals(expected, actual); 
    }

}
