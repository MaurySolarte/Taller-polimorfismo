package com.unicauca.taller1;

import com.unicauca.taller1.domain.*;

import java.util.ArrayList;
import java.util.List;

public class Taller1 {

  
   public static void main(String[] args) {
        
        Figure fig1 = new Circle(1);
        Figure fig2 = new Circle(2.3);
        Figure fig3 = new Square(10);
        Figure fig4 = new Square(2.1);
        Figure fig5 = new Triangle(2, 3, 2, 5);        
        
        
        
        List<Figure> figures = new ArrayList<>();
        
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        figures.add(fig4);
        figures.add(fig5);
                
        for(Figure fig : figures){
            System.out.println("El area es: " + fig.calculateArea());
            System.out.println("El perimetro es: " + fig.calculatePerimeter());
        }
                
    }
}
