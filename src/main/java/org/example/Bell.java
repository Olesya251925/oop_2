package org.example;

import java.util.Scanner;

public class Bell {
    private boolean isDing = true;

    public void sound() {
        if (isDing) {
            System.out.println("ding");// Если true, выводим "ding"
        } else {
            System.out.println("dong"); // Если false, выводим "dong"
        }
        isDing = !isDing;
    }

    public static void inputSounds() {
        Bell bell = new Bell();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество звуков (введите 0 для выхода): ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            bell.sound();
        }
    }
}
