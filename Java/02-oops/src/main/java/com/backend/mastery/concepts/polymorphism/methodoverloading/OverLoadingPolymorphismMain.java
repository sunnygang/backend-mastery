package com.backend.mastery.concepts.polymorphism.methodoverloading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverLoadingPolymorphismMain {
    private static final Logger log = LoggerFactory.getLogger(OverLoadingPolymorphismMain.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = calculator.add(1, 2);
        double y = calculator.add(1.1, 2.2);
        log.info("Value of x = {}", x);
        log.info("Value of y = {}", y);
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
