package com.javi.javifiguras;

public class Rectangle extends AbstractShape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super("Rectángulo");
        validatePositive(width, height);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void draw() {
        System.out.println("Dibujando " + getName() + " (" + width + "x" + height + "): ▭");
    }
}
