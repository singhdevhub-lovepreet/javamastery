package com.singhdevhub;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(expected, actual);
    }

    @Test
    public void setAndGetYear() {
        car.setYear(2020);
        assertEquals(2020, car.getYear());
    }

    @Test
    public void setAndGetPrice() {
        car.setPrice(25000.50);
        assertEquals(25000.50, car.getPrice(), 0.001);
    }

    @Test
    public void setAndGetIsElectric() {
        car.setIsElectric(true);
        assertTrue(car.getIsElectric());
    }

    @Test
    public void testTotalCars() {
        int initialCount = Car.getTotalCars();
        Car newCar = new Car();
        assertEquals(initialCount + 1, Car.getTotalCars());
    }

    @Test
    public void testCarDetails() {
        car.setCarName("Tesla");
        car.setYear(2023);
        car.setPrice(50000.00);
        car.setIsElectric(true);
        
        String expected = "Car: Tesla, Year: 2023, Price: $50000.00, Electric: true";
        assertEquals(expected, car.getCarDetails());
    }

    @Test
    public void testCalculateDiscountedPrice() {
        car.setPrice(10000.00);
        double discountedPrice = car.calculateDiscountedPrice(10);
        assertEquals(9000.00, discountedPrice, 0.001);
    }

    @Test
    public void testCalculateCarAge() {
        car.setYear(2018);
        int age = car.calculateCarAge(2023);
        assertEquals(5, age);
    }
}
