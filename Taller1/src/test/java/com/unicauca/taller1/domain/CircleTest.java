package com.unicauca.taller1.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    
    public CircleTest() {
    }
    
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Circle instance = new Circle(2);
        double expResult = 12.566;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);
        
    }

    
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Circle instance = new Circle(3);
        double expResult = 28.274;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.001);
        
    }
    
}
