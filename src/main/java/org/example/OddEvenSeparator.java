package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenSeparator {
    private List<Integer> numbers; // Список для хранения введенных чисел

    public OddEvenSeparator() {
        this.numbers = new ArrayList<>(); // Инициализация списка
    }

    public void addNumber(int number) {
        numbers.add(number);  // Добавляем число в список
    }

    public void even() {
        System.out.print("Чётные числа: ");
        for (int number : numbers) { //проходим по всем числам
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public void odd() {
        System.out.print("Нечётные числа: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void inputNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа (разделяйте пробелами):");
        String input = scanner.nextLine();
        String[] inputs = input.trim().split("\\s+");

        // Проходим по всем введенным строкам
        for (String str : inputs) {
            try {
                int number = Integer.parseInt(str); // Пробуем преобразовать строку в целое число
                separator.addNumber(number); // Добавляем число в список
            } catch (NumberFormatException e) { // Обрабатываем исключение, если ввод некорректен
                System.out.println("Пожалуйста, введите корректные целые числа.");
            }
        }

        separator.even(); // Вызываем метод для вывода четных чисел
        separator.odd(); // Вызываем метод для вывода нечетных чисел
    }
}
