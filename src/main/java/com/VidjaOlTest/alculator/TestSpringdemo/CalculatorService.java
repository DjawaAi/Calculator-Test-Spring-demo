package com.VidjaOlTest.alculator.TestSpringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NullPointerException("Одна или несколько переменных не переданы");
        }
        return a + " + " + b + " = " + (a + b);
    }

    public String minus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NullPointerException("Одна или несколько переменных не переданы");
        }
        return a + " - " + b + " = " + (a - b);
    }

    public String multiply(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NullPointerException("Одна или несколько переменных не переданы");
        }
        return a + " * " + b + " = " + (a * b);
    }

    public String divide(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NullPointerException("Одна или несколько переменных не переданы");
        }
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль фарс");
        }
        return a + " / " + b + " = " + (float) a / b;
    }
}

