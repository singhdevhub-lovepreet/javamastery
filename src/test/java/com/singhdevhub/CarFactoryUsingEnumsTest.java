package com.singhdevhub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singhdevhub.assignments.CarFactory;
import com.singhdevhub.assignments.CarFactoryUsingEnums;
import com.singhdevhub.enums.CarsEnum;
import com.singhdevhub.pojo.Audi;
import com.singhdevhub.pojo.BMW;
import com.singhdevhub.pojo.ICar;

public class CarFactoryUsingEnumsTest{
    
    
    ByteArrayOutputStream outputStream;
    PrintStream printStream;
    CarFactoryUsingEnums carFactory;

    @BeforeEach
    public void init(){
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        carFactory = new CarFactoryUsingEnums();
    }

    @Test
    public void getCarUsingIfElse(){
        ICar car =carFactory.getCarUsingIfElse(CarsEnum.BMW);
        assertTrue(car instanceof BMW);
    }

    @Test
    public void getCarUsingSwitch(){
        ICar car =carFactory.getCarUsingIfElse(CarsEnum.AUDI);
        assertTrue(car instanceof Audi);
    }

    @Test
    public void printCarNames(){
        carFactory.printCarNames();
        assertEquals(outputStream.toString().trim(),"BMW Audi");
    }


}
