
package com.unicauca.taller1.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    
    public TriangleTest() {
    }
    
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Triangle instance = new Triangle(3,4, 1, 1.5);
        double expResult = 5.5;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);

    }

    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(5,5, 5, 5);
        double expResult = 12.5;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.001);

    }
    
}
