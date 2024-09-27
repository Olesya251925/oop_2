package geometry3d;

import geometry2d.Figure;
import Exceptions.InvalidFigureException;

public class Cylinder {
    private Figure base; // Поле для хранения основания цилиндра (двумерная фигура)
    private double height; // Поле для хранения высоты цилиндра

    public Cylinder(Figure base, double height) throws InvalidFigureException {
        if (base == null) { // Проверка, является ли основание нулевым
            throw new InvalidFigureException("Основание фигуры не может быть нулевым.");
        }
        this.base = base; // Установка основания
        this.height = height; // Установка высоты
    }

    // Метод для вычисления объема цилиндра
    public double volume() {
        return base.area() * height; // Объем = площадь основания * высота
    }

    @Override
    public String toString() { // Переопределение метода toString()
        return "Цилиндр с основанием: " + base.toString() + " и высотой: " + height;
    }
}
