package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return multiply(y) + minus(y) + divide(y) + sum(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        result = minus(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(5));
        System.out.println(calculator.divide(5));
        System.out.println(calculator.sumAllOperation(5));
    }
}
