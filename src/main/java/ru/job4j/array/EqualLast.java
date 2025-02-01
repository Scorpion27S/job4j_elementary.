package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        if (left.length == 0 || right.length == 0) {
            return false;
        }

        return right[right.length - 1] == left[left.length - 1];
    }
}