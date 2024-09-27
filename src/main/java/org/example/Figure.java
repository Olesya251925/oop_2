package org.example;

import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import exceptions.InvalidFigureException;
import exceptions.NegativeDimensionException;

import java.util.Scanner;

public class Figure {
    public static void inputFigures() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите радиус окружности: ");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);

            System.out.print("Введите ширину прямоугольника: ");
            double width = scanner.nextDouble();
            System.out.print("Введите высоту прямоугольника: ");
            double height = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(width, height);

            System.out.println(circle);
            System.out.println("Площадь окружности: " + circle.area());

            System.out.println(rectangle);
            System.out.println("Площадь прямоугольника: " + rectangle.area());

            System.out.print("Введите высоту цилиндра: ");
            double cylinderHeight = scanner.nextDouble();
            Cylinder cylinder = new Cylinder(circle, cylinderHeight);
            System.out.println("Объем цилиндра: " + cylinder.volume());
            System.out.println(cylinder);

        } catch (InvalidFigureException | NegativeDimensionException e) {
            System.err.println(e.getMessage());
        }
    }
}
