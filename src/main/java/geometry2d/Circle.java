package geometry2d;

import Exceptions.NegativeDimensionException;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) throws NegativeDimensionException {
        if (radius < 0) {
            throw new NegativeDimensionException("Радиус не может быть отрицательным.");
        }
        this.radius = radius; // Установка радиуса
    }

    @Override
    public double area() { // Переопределение метода area() из интерфейса Figure
        return Math.PI * radius * radius; // Вычисление площади окружности
    }

    @Override
    public String toString() { // Переопределение метода toString()
        return "Окружность с радиусом: " + radius; // Возвращение строкового представления окружности
    }
}
