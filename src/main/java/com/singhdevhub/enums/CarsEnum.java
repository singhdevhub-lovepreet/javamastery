package com.singhdevhub.enums;

public enum CarsEnum {
    
    BMW("BMW"),
    AUDI("Audi");

    private String carName;

    CarsEnum(String carName){
        this.carName = carName; // constructor with parameter
    }

    public String getCarName(){
        return carName;
    }

}
