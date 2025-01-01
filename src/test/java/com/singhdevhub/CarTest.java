package com.singhdevhub;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.singhdevhub.assignments.Car;

public class CarTest {
    private Car car;

    @BeforeEach
    public void init(){
        car = new Car();
    }

    @Test
    public void setCarName(){
        car.setCarName("BMW");
        String expected = "BMW";
        String actual = car.getCarName();
        assert(expected.equals(actual));
    }

}
