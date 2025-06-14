package com.singhdevhub.assignments;

import com.singhdevhub.enums.CarsEnum;
import com.singhdevhub.pojo.Audi;
import com.singhdevhub.pojo.BMW;
import com.singhdevhub.pojo.ICar;

public class CarFactoryUsingEnums extends BMW{
    
    /*
     * Assignment 6
     * @Description: a class which gives an object of a car depending on the car name
     * @Extras: Check pojo folder Audi and BMW classes
     */

    /*
     * @Description: a class which gives an object of a car depending on the car name
     * @Input:- car constant
     * @Output:- object of a car
     * @Extras:- use if else on carName. use carName.getCarName() and carName directly too
     */
    
    public ICar getCarUsingIfElse(CarsEnum carName){
        if(carName.getCarName() == "BMW"){
            return new BMW();
        }else if(carName == CarsEnum.AUDI){
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

     public ICar getCarUsingSwitch(CarsEnum carName){
        switch(carName){
            case BMW:
                return new BMW();
            case AUDI:
                return new Audi();
            default:
                return null;
        }
    }
    
    /*
     * @Input:- None
     * @Output:- print "BMW Audi"
     * @Extras:- use for loop on enums
     */

     public void printCarNames(){
        for(CarsEnum carName : CarsEnum.values()){
            System.out.print(carName.getCarName());
            System.out.print(" ");
        }
    }

}
