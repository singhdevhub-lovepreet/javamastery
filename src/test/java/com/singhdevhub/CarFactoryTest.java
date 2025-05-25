package com.singhdevhub;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singhdevhub.assignments.CarFactory;
import com.singhdevhub.pojo.Audi;
import com.singhdevhub.pojo.BMW;
import com.singhdevhub.pojo.ICar;

public class CarFactoryTest {
    
    private CarFactory carFactory;


    @BeforeEach
    public void init(){
        carFactory = new CarFactory();
    }

    @Test
    public void getCarUsingIfElse(){
        ICar car =carFactory.getCarUsingIfElse("BMW");
        assertTrue(car instanceof BMW);
    }

    @Test
    public void getCarUsingSwitch(){
        ICar car =carFactory.getCarUsingIfElse("Audi");
        assertTrue(car instanceof Audi);
    }
    
}
