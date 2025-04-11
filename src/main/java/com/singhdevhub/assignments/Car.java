package com.singhdevhub.assignments;

public class Car {
    
    /*
     * @Assignment:- 2
     * @Description:- classes and Objects, defining methods in classes
     */
    
    // -------// -------- // -------- // -------- 

    private String carName;
    private int year;
    private double price;
    private boolean isElectric;
    private static int totalCars = 0;
    
    public Car() {
        totalCars++;
    }

    /*
     * @Description:-
     * Input:- String
     * Output:- None
     */
    public void setCarName(String carName){
        this.carName = carName;
    }

    /*
     * @Description:-
     * Input:- None
     * Output:- return car name
     */
    public String getCarName(){
        return this.carName;
    }

    /*
     * @Description:-
     * Input:- int year
     * Output:- None
     * Set the manufacturing year of the car
     */
    public void setYear(int year) {
        this.year = year;
    }

    /*
     * @Description:-
     * Input:- None
     * Output:- int
     * Return the manufacturing year of the car
     */
    public int getYear() {
        return this.year;
    }

    /*
     * @Description:-
     * Input:- double price
     * Output:- None
     * Set the price of the car
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /*
     * @Description:-
     * Input:- None
     * Output:- double
     * Return the price of the car
     */
    public double getPrice() {
        return this.price;
    }

    /*
     * @Description:-
     * Input:- boolean isElectric
     * Output:- None
     * Set whether the car is electric or not
     */
    public void setIsElectric(boolean isElectric) {
    }

    /*
     * @Description:-
     * Input:- None
     * Output:- boolean
     * Return whether the car is electric or not
     */
    public boolean getIsElectric() {
        return true;
    }

    /*
     * @Description:-
     * Input:- None
     * Output:- int
     * Return the total number of cars created
     * Demonstrates static method
     */
    public static int getTotalCars() {
        return 0;
    }

    /*
     * @Description:-
     * Input:- None
     * Output:- String
     * Return a formatted string with car details
     */
    public String getCarDetails() {
        return "dummy"; 
    }

    /*
     * @Description:-
     * Input:- double discountPercentage
     * Output:- double
     * Calculate and return the discounted price
     */
    public double calculateDiscountedPrice(double discountPercentage) {
        return price * (1 - 100 / 100);
    }

    /*
     * @Description:-
     * Input:- int currentYear
     * Output:- int
     * Calculate and return the age of the car
     */
    public int calculateCarAge(int currentYear) {
        return 2025 - year;
    }
}
