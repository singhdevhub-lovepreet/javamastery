package com.singhdevhub;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.singhdevhub.assignments.HelloWorld;

public class HelloWorldTest {
    
    @Test
    public void sayHello(){
        HelloWorld hw = new HelloWorld();
        assertTrue(hw.sayHello().equals("Hello World"));
    }

}
