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
        assertThrows(NullPointerException.class, () -> service.plus(null, 5));
        assertThrows(NullPointerException.class, () -> service.plus(8, null));
        assertThrows(NullPointerException.class, () -> service.plus(null, null));
        assertEquals("5 + 6 = 11", service.plus(5, 6));
        assertEquals("-5 + 6 = 1", service.plus(-5, 6));
        assertEquals("5 + -6 = -1", service.plus(5, -6));
        assertEquals("-5 + -6 = -11", service.plus(-5, -6));
        assertEquals("5 + 0 = 5", service.plus(5, 0));
        assertEquals("0 + 6 = 6", service.plus(0, 6));
    }

    @Test
    void minusTest() {
        assertThrows(NullPointerException.class, () -> service.minus(null, 5));
        assertThrows(NullPointerException.class, () -> service.minus(8, null));
        assertThrows(NullPointerException.class, () -> service.minus(null, null));
        assertEquals("5 - 6 = -1", service.minus(5, 6));
        assertEquals("-5 - 6 = -11", service.minus(-5, 6));
        assertEquals("5 - -6 = 11", service.minus(5, -6));
        assertEquals("-5 - -6 = 1", service.minus(-5, -6));
        assertEquals("5 - 0 = 5", service.minus(5, 0));
        assertEquals("0 - 6 = -6", service.minus(0, 6));

    }

    @Test
    void multiplyTest() {
        assertThrows(NullPointerException.class, () -> service.multiply(null, 5));
        assertThrows(NullPointerException.class, () -> service.multiply(8, null));
        assertThrows(NullPointerException.class, () -> service.multiply(null, null));
        assertEquals("5 * 6 = 30", service.multiply(5, 6));
        assertEquals("-5 * 6 = -30", service.multiply(-5, 6));
        assertEquals("5 * -6 = -30", service.multiply(5, -6));
        assertEquals("-5 * -6 = 30", service.multiply(-5, -6));
        assertEquals("5 * 0 = 0", service.multiply(5, 0));
        assertEquals("0 * 6 = 0", service.multiply(0, 6));

    }

    @Test
    void divideTest() {
        assertThrows(NullPointerException.class, () -> service.divide(null, 5));
        assertThrows(NullPointerException.class, () -> service.divide(8, null));
        assertThrows(NullPointerException.class, () -> service.divide(null, null));
        assertEquals("5 / 6 = 0.8333333", service.divide(5, 6));
        assertEquals("-5 / 6 = -0.8333333", service.divide(-5, 6));
        assertEquals("5 / -6 = -0.8333333", service.divide(5, -6));
        assertEquals("-5 / -6 = 0.8333333", service.divide(-5, -6));
        assertEquals("0 / 6 = 0.0", service.divide(0, 6));
        assertThrows(IllegalArgumentException.class, () -> service.divide(4, 0));

    }
}
