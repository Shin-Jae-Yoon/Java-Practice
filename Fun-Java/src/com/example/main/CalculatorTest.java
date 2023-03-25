package com.example.main;

import com.example.util.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(1, 2));
        System.out.println(calculator.minus(3, 1));
    }
}
