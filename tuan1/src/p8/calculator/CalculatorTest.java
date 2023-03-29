package p8.calculator;

import p8.calculator.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println(Calculator.calculate(1, 2, '+'));
        System.out.println(Calculator.calculate(1, 2, '-'));
        System.out.println(Calculator.calculate(1, 2, '*'));
        System.out.println(Calculator.calculate(1, 2, '/'));
    }
}
