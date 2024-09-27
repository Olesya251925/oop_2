package org.example;

import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import exceptions.InvalidFigureException;
import exceptions.NegativeDimensionException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FigureTest {

    // Тестируем расчет площади круга с радиусом 5
    @Test
    public void testCircleArea() throws NegativeDimensionException {
        Circle circle = new Circle(5);
        assertEquals(78.53981633974483, circle.area(), 0.0001); // Ожидаемая площадь круга
    }

    // Тестируем расчет площади прямоугольника с шириной 4 и высотой 6
    @Test
    public void testRectangleArea() throws NegativeDimensionException {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(24.0, rectangle.area(), 0.0001); // Ожидаемая площадь прямоугольника
    }

    // Тестируем расчет объема цилиндра с основанием-кругом радиусом 5 и высотой 10
    @Test
    public void testCylinderVolume() throws InvalidFigureException, NegativeDimensionException {
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(circle, 10);
        assertEquals(785.3981633974483, cylinder.volume(), 0.0001); // Ожидаемый объем цилиндра
    }

    // Тестируем выброс исключения при попытке создать круг с отрицательным радиусом
    @Test
    public void testCircleNegativeRadius() {
        assertThrows(NegativeDimensionException.class, () -> new Circle(-1));
    }

    // Тестируем выброс исключения при попытке создать прямоугольник с отрицательной высотой
    @Test
    public void testRectangleNegativeDimensions() {
        assertThrows(NegativeDimensionException.class, () -> new Rectangle(4, -2));
    }

    // Тестируем выброс исключения при попытке создать цилиндр с null-основанием
    @Test
    public void testCylinderNullBase() {
        assertThrows(InvalidFigureException.class, () -> new Cylinder(null, 10));
    }
}
