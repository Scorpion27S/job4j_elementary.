package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) Math.pow(i, 2);
        }
        /* заполнить массив через цикл элементами от 0 до bound , возведенными в квадрат */
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
