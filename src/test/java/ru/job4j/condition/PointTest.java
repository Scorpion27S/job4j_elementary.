package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to02then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when42to62then2() {
        double expected = 2;
        Point a = new Point(4, 2);
        Point b = new Point(6, 2);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22to62then4() {
        double expected = 4;
        Point a = new Point(2, 2);
        Point b = new Point(6, 2);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }
}