package com.VidjaOlTest.alculator.TestSpringdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String hello() {
        return service.hello();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer a, Integer b) {
        return service.plus(a, b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer a, Integer b) {
        return service.minus(a, b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer a, Integer b) {
        return service.multiply(a, b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer a, Integer b) {
        return service.divide(a, b);
    }
}
