package com.singhdevhub.pojo;

public class Audi implements ICar{
   
    private String carName;

    @Override
    public void driveCar(){
        System.out.println("Driving Audi Car");
    }

    @Override
    public String getCarName(){
        return carName;
    }

    public void setCarName(){
        this.carName = "Audi";
    }

}
