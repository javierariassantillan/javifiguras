package com.javi.javifiguras;

public class Circle extends AbstractShape {
    private final double radius;

    public Circle(double radius) {
        super("Círculo");
        validatePositive(radius);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando " + getName() + " (r=" + radius + "): ooo");
    }
}
