package com.VidjaOlTest.alculator.TestSpringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }

    public String minus (int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }

    public String multiply(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }

    public String divide (int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль фарс");
        }
        return a + " / " + b + " = " + (a / b);
    }
}
