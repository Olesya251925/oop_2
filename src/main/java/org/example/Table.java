package org.example;

import java.util.Scanner;

public class Table {
    private int[][] data;

    public Table(int rows, int cols) {
        data = new int[rows][cols]; // Создаем двумерный массив с указанным количеством строк и столбцов
    }

    // Метод для получения значения по заданным индексам
    public int getValue(int row, int col) {
        return data[row][col]; // Возвращаем значение из массива
    }

    // Метод для установки значения в заданной ячейке
    public void setValue(int row, int col, int value) {
        data[row][col] = value; // Устанавливаем значение в массив
    }

    // Метод для получения количества строк в таблице
    public int rows() {
        return data.length; // Возвращаем количество строк
    }

    // Метод для получения количества столбцов в таблице
    public int cols() {
        return data[0].length;
    }

    // Переопределение метода toString для вывода таблицы в виде строки
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Создаем объект StringBuilder для построения строки
        for (int[] row : data) { // Проходим по всем строкам массива
            for (int value : row) { // Проходим по всем значениям в строке
                sb.append(value).append(" "); // Добавляем значение в строку с пробелом
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // Метод для вычисления среднего арифметического значений в таблице
    public double average() {
        int sum = 0;
        int count = 0;
        for (int[] row : data) { // Проходим по всем строкам массива
            for (int value : row) { // Проходим по всем значениям в строке
                sum += value; // Добавляем значение к сумме
                count++; // Увеличиваем счетчик значений
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }

    public static void inputTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        Table table = new Table(rows, cols);

        System.out.println("Введите значения для таблицы:");
        for (int i = 0; i < rows; i++) { // Проходим по всем строкам
            for (int j = 0; j < cols; j++) { // Проходим по всем столбцам
                System.out.print("Введите значение для ячейки [" + i + "][" + j + "]: ");
                int value = scanner.nextInt();
                table.setValue(i, j, value);
            }
        }

        System.out.println("Ваша таблица:");
        System.out.println(table);

        double average = table.average();
        System.out.printf("Среднее арифметическое: %.3f\n", average);
    }
}
