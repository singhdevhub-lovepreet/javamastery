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
        Boolean isTrue = true;
        System.out.print(isTrue);
        System.out.print(", ");

        // convert false (premitive) to Boolean object using constructor and pass false without string quotes and print false
        Boolean isFalse = new Boolean(false);
        System.out.print(isFalse);
        System.out.print(", ");

        // convert true (primitive) to Boolean object using constructor and pass true with string quotes and print true
        Boolean isTrue1 = new Boolean("true");
        System.out.print(isTrue1);
        System.out.print(", ");

        // convert false (primitive) to Boolean object using static method valueOf() and pass false with string quotes and print false
        Boolean isFalse1 = Boolean.valueOf("false");
        System.out.print(isFalse1);
        System.out.print(", ");
        
        // convert true (primitive) to Boolean object using Boolean.TRUE and print true
        Boolean isTrue2 = Boolean.TRUE;
        System.out.print(isTrue2);
        System.out.print(", ");

        // compare isTrue and isFalse1 and print true or false
        System.out.print(isTrue == isFalse1);
        System.out.print(", ");

        //compare true with Boolean.TRUE and print true or false
        System.out.println(isTrue == Boolean.TRUE);

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

        Character character = 'a';
        Character character1 = Character.valueOf('a');
        System.out.println(character == character1);
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

        Integer integer = 10;
        Integer integer1 = Integer.valueOf(10);
        System.out.println(integer == integer1);
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

        Long long1 = 10L;
        Long long2 = Long.valueOf(10L);
        System.out.println(long1 == long2);
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

        Float float1 = 10.0f;
        Float float2 = Float.valueOf(10.0f);
        System.out.println(float1.equals(float2));
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

        Double double1 = 10.0;
        Double double2 = Double.valueOf(10.0);
        System.out.println(double1.equals(double2));
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

        Character character = 'a';
        Character character1 = 'b';
        System.out.println(character1.compareTo(character) < 0);
     }

}
