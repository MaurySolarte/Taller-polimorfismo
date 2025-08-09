package com.unicauca.taller1.domain;

import java.util.LinkedList;
import java.util.Vector;

public class Triangle implements Figure{
    
    private double base;
    private double height;
    private double[] sides = new double[3];

    public Triangle(double base, double height, double[] sides) {
        this.base = base;
        this.height = height;
        this.sides = sides;
    }
    
    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.sides[0] = side1;
        this.sides[1] = side2;
        this.sides[2] = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
            
    @Override
    public double calculatePerimeter(){
        double perimeter = 0;
        for(Double d:sides){
            perimeter+= d;
        }
        return perimeter;
    }
    
    @Override
    public double calculateArea(){
        return (base*height)/2;
    }
    
}