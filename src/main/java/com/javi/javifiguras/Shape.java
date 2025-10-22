package com.javi.javifiguras;

public interface Shape {
    String getName();
    double area();
    double perimeter();

    default void draw() {
        System.out.println("Dibujando " + getName() + " (demo)");
    }
}
