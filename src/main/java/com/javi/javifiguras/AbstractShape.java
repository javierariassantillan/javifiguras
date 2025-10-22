package com.javi.javifiguras;

public abstract class AbstractShape implements Shape {
    private final String name;

    protected AbstractShape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    // Método auxiliar para validar que los valores sean positivos
    protected void validatePositive(double... values) {
        for (double v : values) {
            if (v <= 0) {
                throw new IllegalArgumentException("Los valores deben ser mayores que 0");
            }
        }
    }
}
