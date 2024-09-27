package geometry2d;

import Exceptions.NegativeDimensionException;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) throws NegativeDimensionException {
        if (width < 0 || height < 0) {
            throw new NegativeDimensionException("Ширина и высота не могут быть отрицательными.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height; // Вычисление площади прямоугольника
    }

    @Override
    public String toString() {
        return "Прямоугольник с шириной: " + width + " и высотой: " + height; // Возвращение строкового представления прямоугольника
    }
}
