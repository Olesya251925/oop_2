package org.example;

import java.util.Scanner;

public class Balance {
    private double leftWeight; // левая чаша
    private double rightWeight; // правая чаша

    // Конструктор класса Balance
    public Balance() {
        this.leftWeight = 0.0; // Инициализация веса левой чаши в 0
        this.rightWeight = 0.0; // Инициализация веса правой чаши в 0
    }

    // Метод для добавления веса на левую чашу
    public void addLeft(double weight) {
        if (weight > 0) { // Проверка, что вес положительный
            leftWeight += weight; // Увеличиваем вес левой чаши
        }
    }

    // Метод для добавления веса на правую чашу
    public void addRight(double weight) {
        if (weight > 0) { // Проверка, что вес положительный
            rightWeight += weight; // Увеличиваем вес правой чаши
        }
    }

    // Метод для определения результата сравнения весов
    public String result() {
        if (leftWeight == rightWeight) {
            return "=";
        } else if (leftWeight > rightWeight) {
            return "L";
        } else {
            return "R";
        }
    }

    public static void inputWeights() {
        Balance balance = new Balance();
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для ввода данных

        System.out.print("Введите вес для левой чаши: ");
        String leftWeightInput = scanner.next(); // Считываем введенное значение
        double leftWeight = Double.parseDouble(leftWeightInput.replace(",", ".")); // Заменяем запятую на точку и преобразуем в double
        balance.addLeft(leftWeight); // Добавляем вес на левую чашу

        System.out.print("Введите вес для правой чаши: ");
        String rightWeightInput = scanner.next();
        double rightWeight = Double.parseDouble(rightWeightInput.replace(",", ".")); // Заменяем запятую на точку и преобразуем в double
        balance.addRight(rightWeight);

        System.out.println("Результат: " + balance.result()); // Выводим результат сравнения весов
    }
}
