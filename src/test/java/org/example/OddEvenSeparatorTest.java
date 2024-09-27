package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class OddEvenSeparatorTest {

    @Test
    void testAddNumbersAndOutput() {
        OddEvenSeparator separator = new OddEvenSeparator();
        int[] numbersToAdd = {1, 2, 3, 4};

        for (int number : numbersToAdd) {
            separator.addNumber(number);
        }

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        separator.even();
        separator.odd();

        String expectedEvenOutput = "Чётные числа: 2 4 \n";
        String expectedOddOutput = "Нечётные числа: 1 3 \n";

        assertTrue(outContent.toString().contains(expectedEvenOutput));
        assertTrue(outContent.toString().contains(expectedOddOutput));

        System.setOut(System.out);
    }
}
