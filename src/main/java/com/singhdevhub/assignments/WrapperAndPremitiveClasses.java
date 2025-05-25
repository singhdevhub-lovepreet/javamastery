package com.singhdevhub.assignments;

public class WrapperAndPremitiveClasses {
    
    /*
     * @Assignment:- 3
     * @Description:- Working with Wrapper and Premitive classes
     * Wrapper:- Integer, Boolean, Character, Float, Double
     * Primitive:- int, boolean, char, float, double
     */
    
    // -------// -------- // -------- // -------- 

    /* 
     * @Description:- Working with Boolean (boolean:- 1Byte)
     * Input:- None
     * Output:- "true, false, true, false, true, false, true"
     */

     public void workingWithBoolean(){

        // convert true (primitive) to Boolean object using Autoboxing and print true
         // example given below (uncomment
//        Boolean isTrue = true;
//        System.out.print(isTrue);
//        System.out.print(", ");

        // convert false (premitive) to Boolean object using constructor and pass false without string quotes and print false


        // convert true (primitive) to Boolean object using constructor and pass true with string quotes and print true


        // convert false (primitive) to Boolean object using static method valueOf() and pass false with string quotes and print false

        
        // convert true (primitive) to Boolean object using Boolean.TRUE and print true


        // compare isTrue and isFalse1 and print true or false


        //compare true with Boolean.TRUE and print true or false


    }

     /*
     * @Description:- Working with Character
     * Input:- None
     * Print Output:- true
     */

    public void workingWithCharacter(){
        /*
         * convert 'a' to Character object using Autoboxing
         * then convert 'a' to Character using Character.valueOf()
         * then equate them to print true
         * Note:- we can pass 'a' not "a" because "a" is a String
         * Extra:- try using new Character('a') instead of valueOf()
         */

    }

    /*
     * @Description:- Working with Integer
     * Input:- None
     * Print Output:- true
     */

    public void workingWithInteger(){
        /*
         * convert 10 to Integer object using Autoboxing
         * then convert 10 to Integer using Integer.valueOf()
         * then equate them to print true
         * Note:- You can pass 10, "10" etc in valueOf() static method
         * Extra:- try using new Integer(10) instead of valueOf(), and can we pass "10", 10.0 etc
         */

    }

    /*
     * @Description:- Working with Long
     * Input:- None
    * Print Output:- true
     */

    public void workingWithLong(){
        /*
         * convert 10 to Long object using Autoboxing
         * then convert 10 to Long using Long.valueOf()
         * then equate them to print true
         */ 

    }
    
    /*
     * @Description:- Working with Float
     * Input:- None
     * Print Output:- true
     */

    public void workingWithFloat(){
        /*
         * convert 10.0 to Float object using Autoboxing
         * then convert 10.0 to Float using Float.valueOf()
         * then equate them to print true
         */ 

    }

    /*
     * @Description:- Working with Double
     * Input:- None
     * Print Output:- true
     */

    public void workingWithDouble(){
        /*
         * convert 10.0 to Double object using Autoboxing
         * then convert 10.0 to Double using Double.valueOf()
         * then equate them to print true
         */ 

    }
    
    /*
     * @Description:- Working with Comparison between Character 'a' and 'b'
     * input:- None
     * Print Output:- true
     * Hint:- use compareTo()
     */

     public void workingWithComparison(){
        /*
         * convert 'a' to Character object using Autoboxing
         * then convert 'b' to Character using Character.valueOf()
         * then compare them to print true
         * compare 'a' and 'b' and print true or false
         */

     }

}
