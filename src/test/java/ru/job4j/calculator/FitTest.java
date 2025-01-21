package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class FitTest {

    @Test
    void whenManHeight187ThenWeight10005() {
        short heightMan = 187;
        double expected = 100.05;
        double result = Fit.manWeight(heightMan);
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenManHeight170ThenWeight805() {
        short heightMan = 170;
        double expected = 80.5;
        double result = Fit.manWeight(heightMan);
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWomanHeight170ThenWeight690() {
        short heightWoman = 170;
        double expected = 69.0;
        double result = Fit.womanWeight(heightWoman);
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWomanHeight160ThenWeight575() {
        short heightWoman = 160;
        double expected = 57.5;
        double result = Fit.womanWeight(heightWoman);
        assertThat(result).isCloseTo(expected, within(0.01));
    }
}
