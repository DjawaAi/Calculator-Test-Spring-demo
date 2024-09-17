package com.VidjaOlTest.alculator.TestSpringdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void hello() {
        assertEquals("Добро пожаловать в калькулятор", service.hello());
    }
}