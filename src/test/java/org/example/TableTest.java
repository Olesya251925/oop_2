package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void testTableInitialization() {
        // Тест инициализации таблицы с 3 строками и 4 столбцами
        Table table = new Table(3, 4);
        assertEquals(3, table.rows()); // Проверка количества строк
        assertEquals(4, table.cols()); // Проверка количества столбцов
        assertEquals(0, table.getValue(0, 0)); // Проверка значения по умолчанию в ячейке (0,0)
        assertEquals(0, table.getValue(2, 3)); // Проверка значения по умолчанию в ячейке (2,3)
    }

    @Test
    void testSetValueAndGetValue() {
        // Тест установки и получения значений в таблице
        Table table = new Table(2, 2);
        table.setValue(0, 0, 5); // Установка значения 5 в ячейку (0,0)
        table.setValue(1, 1, 10); // Установка значения 10 в ячейку (1,1)
        assertEquals(5, table.getValue(0, 0)); // Проверка значения 5 в ячейке (0,0)
        assertEquals(10, table.getValue(1, 1)); // Проверка значения 10 в ячейке (1,1)
        assertEquals(0, table.getValue(0, 1)); // Проверка значения по умолчанию в ячейке (0,1)
    }

    @Test
    void testToString() {
        // Тест строкового представления таблицы
        Table table = new Table(2, 2);
        table.setValue(0, 0, 1); // Установка значений в таблицу
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 3);
        table.setValue(1, 1, 4);
        String expected = "1 2 \n3 4 \n"; // Ожидаемое строковое представление
        assertEquals(expected, table.toString()); // Проверка метода toString()
    }

    @Test
    void testAverage() {
        Table table = new Table(2, 2);
        table.setValue(0, 0, 2); // Установка значений в таблицу
        table.setValue(0, 1, 4);
        table.setValue(1, 0, 6);
        table.setValue(1, 1, 8);
        assertEquals(5.0, table.average(), 0.0001); // Проверка среднего значения (5.0)
    }

    @Test
    void testAverageWithZeroes() {
        // Тест расчета среднего значения для таблицы, заполненной нулями
        Table table = new Table(2, 2);
        assertEquals(0.0, table.average(), 0.0001); // Среднее значение должно быть 0.0
    }
}
