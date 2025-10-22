package com.javi.javifiguras;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista polimórfica de figuras
        List<Shape> shapes = new ArrayList<>();

        // Creamos diferentes figuras
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Triangle(3, 4, 5));

        // Mostramos información de cada figura
        System.out.println("=== Figuras ===");
        for (Shape s : shapes) {
            s.draw();
            System.out.printf("%s -> Área: %.2f, Perímetro: %.2f%n",
                    s.getName(), s.area(), s.perimeter());
        }
    }
}
