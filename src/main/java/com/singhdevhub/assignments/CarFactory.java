package com.singhdevhub.assignments;

import com.singhdevhub.pojo.Audi;
import com.singhdevhub.pojo.BMW;
import com.singhdevhub.pojo.ICar;

public class CarFactory extends BMW{
    
    /*
     * Assignment 5
     * @Description: a class which gives an object of a car depending on the car name
     * @Extras: Check pojo folder Audi and BMW classes
     */

    /*
     * @Description: a class which gives an object of a car depending on the car name
     * @Input:- car name (BMW, Audi)
     * @Output:- object of a car
     * @Extras:- use if else on carName
     */
    
    public ICar getCarUsingIfElse(String carName){
        if(carName == "BMW"){
            return new BMW();
        }else if(carName == "Audi"){
            return new Audi();
        }
        return null;
    }

    /*
     * @Description: a class which gives an object of a car depending on the car name
     * @Input:- car name (BMW, Audi)
     * @Output:- object of a car
     * @Extras:- use switch statement instead of if else
     */
    
     public ICar getCarUsingSwitch(String carName){
        switch(carName){
            case "BMW":
                return new BMW();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }

}
