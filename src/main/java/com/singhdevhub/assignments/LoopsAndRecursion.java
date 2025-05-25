package com.singhdevhub.assignments;

import java.math.BigDecimal;

public class LoopsAndRecursion {
    
    /*
     * @Assignment:- 4
     * @Description:- Print, return statements
     */
    
    // -------// -------- // -------- // -------- 

    /*
     * @Description:-
     * Input:- None
     * Output:- Star pattern
     * 
     * 
     ** 
     *** 
     **** 
     ***** 
     *******
     ******** 
     ********* 
     **********
     Extras:- use for loop, while loop and use do-while loop
     */

     public void printStarPattern(){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    private BigDecimal calculateSumOfFirstNNumbers(int n){
        BigDecimal sum = new BigDecimal(0);
        for(int i = 1; i <= n; i++){
            sum = sum.add(new BigDecimal(i));
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum); 
        return sum;   
    }
        
    
    /*
     * @Description:-
     * Input:- None
     * Output:- Sum of first n natural numbers
     * Extras:- use a function inside other function
     */
    public BigDecimal calculateSum(int n){
        return calculateSumOfFirstNNumbers(n);
    }

    /*
     * @Description:-
     * Input:- None
     * Output:- Factorial of a number using recursion
     * Extras:- this is about calling a function inside a function
     */
    public BigDecimal calculateFactorial(int n){
        if(n==0 || n==1){
            return new BigDecimal(1);
        }
        return new BigDecimal(n).multiply(calculateFactorial(n-1));
    }

}
