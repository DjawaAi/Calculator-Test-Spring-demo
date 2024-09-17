package com.VidjaOlTest.alculator.TestSpringdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTests {

    CalculatorService service = new CalculatorService();

    @Test
    void helloTest() {
        assertEquals("Добро пожаловать в калькулятор", service.hello());
    }

    @Test
    void plusTest() {
        assertEquals("5 + 6 = 11", service.plus(5, 6));
        assertEquals("-5 + 6 = 1", service.plus(-5, 6));
        assertEquals("5 + -6 = -1", service.plus(5, -6));
        assertEquals("-5 + -6 = -11", service.plus(-5, -6));
        assertEquals("5 + 0 = 5", service.plus(5, 0));
        assertEquals("0 + 6 = 6", service.plus(0, 6));
    }

    @Test
    void minusTest() {
        assertEquals("5 - 6 = -1", service.minus(5, 6));
        assertEquals("-5 - 6 = -11", service.minus(-5, 6));
        assertEquals("5 - -6 = 11", service.minus(5, -6));
        assertEquals("-5 - -6 = 1", service.minus(-5, -6));
        assertEquals("5 - 0 = 5", service.minus(5, 0));
        assertEquals("0 - 6 = -6", service.minus(0, 6));
        //assertThrows(IllegalArgumentException.class, () -> service.divide(4, 0));

    }

    @Test
    void multiplyTest() {
        assertEquals("5 * 6 = 30", service.multiply(5, 6));
        assertEquals("-5 * 6 = -30", service.multiply(-5, 6));
        assertEquals("5 * -6 = -30", service.multiply(5, -6));
        assertEquals("-5 * -6 = 30", service.multiply(-5, -6));
        assertEquals("5 * 0 = 0", service.multiply(5, 0));
        assertEquals("0 * 6 = 0", service.multiply(0, 6));
        //assertThrows(IllegalArgumentException.class, () -> service.divide(4, 0));

    }
}
