package com.javi.javifiguras;

public class Triangle extends AbstractShape {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        super("Triángulo");
        validatePositive(a, b, c);

        // Regla del triángulo: cada lado debe ser menor que la suma de los otros dos
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Los lados no forman un triángulo válido");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2.0; // semiperímetro
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // fórmula de Herón
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando " + getName() + " (" + a + ", " + b + ", " + c + "): ▲");
    }
}
