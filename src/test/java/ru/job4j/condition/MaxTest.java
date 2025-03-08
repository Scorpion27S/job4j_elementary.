package ru.job4j.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("большее из 3 чисел")
    @Test
    void whenMax4To5To8Then8() {
        int left = 4;
        int right = 5;
        int down = 8;
        int result = Math.max(left, Math.max(right, down));
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("большее из 4 чисел")
    @Test
    void whenMax2To3To5To10Then10() {
        int left = 2;
        int right = 3;
        int down = 5;
        int up = 10;
        int result = Math.max(left, Math.max(right, Math.max(down, up)));
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}