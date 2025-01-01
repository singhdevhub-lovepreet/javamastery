package com.singhdevhub;

import com.singhdevhub.assignments.Car;
import com.singhdevhub.assignments.WrapperAndPremitiveClasses;

public class App {
    public static void main(String[] args) {
        System.out.println("Project setuped successfully");
        
        Car car = new Car();
        car.setCarName("BMW");
        System.out.println(car.getCarName());

        WrapperAndPremitiveClasses wnpc = new WrapperAndPremitiveClasses();
        wnpc.workingWithBoolean();
    }
}
