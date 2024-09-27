package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Пример с кнопкой");
            System.out.println("2. Баланс");
            System.out.println("3. Звонок");
            System.out.println("4. Разделение четных и нечетных чисел");
            System.out.println("5. Таблица");
            System.out.println("6. Геометрические фигуры");
            System.out.println("0. Выход");
            System.out.println("Выберите действие:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Button.createUI();
                    break;
                case 2:
                    Balance.inputWeights();
                    break;
                case 3:
                    Bell.inputSounds();
                    break;
                case 4:
                    OddEvenSeparator.inputNumbers();
                    break;
                case 5:
                    Table.inputTable();
                    break;
                case 6:
                    Figure.inputFigures();
                    break;
                case 0:
                    System.out.println("Выход...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
}
