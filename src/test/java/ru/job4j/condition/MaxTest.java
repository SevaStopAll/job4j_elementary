package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.chooseMax(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3to2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.chooseMax(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5to5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.chooseMax(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3to5to7Then7() {
        int first = 3;
        int second = 5;
        int third = 7;
        int result = Max.chooseMax(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax11to3to6to1Then7() {
        int first = 11;
        int second = 3;
        int third = 6;
        int fourth = 1;
        int result = Max.chooseMax(first, second, third, fourth);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }
}