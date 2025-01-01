package com.singhdevhub.assignments;

public class HelloWorld {
    
    /*
     * @Assignment:- 1
     * @Description:- Print, return statements
     */
    
    // -------// -------- // -------- // -------- 
    
    /*
     * @Description:-
     * Input:- None
     * Output:- (void)
     * print:- Hello World
     */

    public void sayHello(){
        System.out.println("Hello World");
    }

    /*
     * @Description:- 
     * Input:- None
     * Output:- "Hello World"
     * Extras:- Use characters to print "Hello World" instead of String
     */

    public void printHelloWorldUsingChars(){
        char helloWorld[] = {'H','e','l','l','o',' ','W','o','r','l','d'};
        System.out.println(helloWorld);
    }
    
    /* @Description:-
     * Input:- None
     * Output:- "Hello World" 
    */

    public String returnHelloWorld(){
        String toReturn = "Hello World";
        return toReturn;
    }

    /*
     * @Description:-
     * Input:- None
     * Output:- 
    -
    --
    ---
    ----
    ------
    -------
    --------
     */
    public void printPyramid(){
        System.out.println("-");
        System.out.println("--");
        System.out.println("---");
        System.out.println("----");
        System.out.println("-----");
        System.out.println("------");
        System.out.println("-------");
    }
    
}
