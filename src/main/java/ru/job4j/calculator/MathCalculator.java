package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAnddelenie(double first, double second) {
        return minus(first, second)
                + delenie(first, second);
    }

    public static double allsum(double first, double second) {
        return sumAndMultiply(first, second)
                + minusAnddelenie(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAnddelenie(10, 20));
        System.out.println("Результат расчета равен: " + allsum(10, 20));
    }
}