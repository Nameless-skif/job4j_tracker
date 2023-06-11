package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To2Then10() {
        int a = 10;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax30To2To7Then30() {
        int a = 30;
        int b = 2;
        int c = 7;
        int result = Max.max(a, b, c);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax30To255To7Then255() {
        int a = 30;
        int b = 255;
        int c = 7;
        int result = Max.max(a, b, c);
        int expected = 255;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax30To2To7To56Then56() {
        int a = 30;
        int b = 2;
        int c = 7;
        int d = 56;
        int result = Max.max(a, b, c, d);
        int expected = 56;
        assertThat(result).isEqualTo(expected);
    }
}