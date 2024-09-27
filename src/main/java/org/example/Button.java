package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Класс Button для подсчета кликов
public class Button {
    private int clickCount;

    public Button() {
        this.clickCount = 0;
    }

    public void click() {
        clickCount++;
        System.out.println("Количество нажатий: " + clickCount);
    }

    public int getClickCount() {
        return clickCount;
    }

    // Создаем новое окно
    public static void createUI() {
        JFrame frame = new JFrame("Button Click Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем кнопку
        JButton button = new JButton("Нажми меня!");
        frame.add(button);

        // Создаем объект Button (класс для подсчета нажатий)
        Button myButton = new Button();

        // // Добавляем действие на нажатие кнопки
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myButton.click();
            }
        });

        // Показываем окно
        frame.setVisible(true);
    }
}
