package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
       double h = p / (2 * (k + 1));
       double l = h * k;
       double s = l * h;
       double result = s;
       return result;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}