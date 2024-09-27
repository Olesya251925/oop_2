package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BellTest {

    @Test
    void testSound() {
        Bell bell = new Bell();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        bell.sound(); // Ожидаем "ding"
        bell.sound(); // Ожидаем "dong"

        String output = outputStream.toString().trim();
        String[] sounds = output.split(System.lineSeparator());

        assertEquals("ding", sounds[0]);
        assertEquals("dong", sounds[1]);
    }
}
