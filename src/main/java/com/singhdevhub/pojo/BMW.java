package com.singhdevhub.pojo;

public class BMW implements ICar{
   
    private String carName;

    @Override
    public void driveCar(){
        System.out.println("Driving BMW Car");
    }

    @Override
    public String getCarName(){
        return carName;
    }

    public void setCarName(){
        this.carName = "BMW";
    }

}
