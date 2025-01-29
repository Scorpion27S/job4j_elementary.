package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }
}