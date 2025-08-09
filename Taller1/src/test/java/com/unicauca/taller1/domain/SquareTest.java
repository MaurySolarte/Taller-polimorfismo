package com.unicauca.taller1.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SquareTest {
    
    public SquareTest() {
    }
    
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Square instance = new Square(5);
        double expResult = 20;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Square instance = new Square(5);
        double expResult = 25;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    
}
