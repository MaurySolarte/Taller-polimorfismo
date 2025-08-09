package com.unicauca.taller1.domain;

public class Circle implements Figure{

    private double radio;    

    public Circle(double radio) {
        this.radio = radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }   
    
    public double getRadio() {
        return radio;
    }
    
    @Override
    public double calculatePerimeter() {
        return Math.PI*radio*2;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radio*radio;
    }
    
}

