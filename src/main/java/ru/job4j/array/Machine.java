package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int rsl = money - price;
        for (int i : coins) {
            while (rsl >= i) {
                rsl -= i;
                result[size++] = i;
            }
        }
        return Arrays.copyOf(result, size);
    }
}