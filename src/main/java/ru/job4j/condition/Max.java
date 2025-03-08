package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int right, int down) {
        return Math.max(left, Math.max(right, down));
    }

    public static int max(int left, int right, int down, int up) {
        return Math.max(left, Math.max(right, Math.max(down, up)));
    }

    public static void main(String[] args) {
        int result1 = Max.max(1, 2, 3);
        System.out.println(result1);
        int result2 = Max.max(1, 2, 3, 4);
        System.out.println(result2);
    }
}