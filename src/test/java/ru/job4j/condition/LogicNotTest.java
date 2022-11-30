package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class LogicNotTest {

    @Test
    public void whenIsEven2thenTrue() {
        int num = 2;
        boolean result = LogicNot.isEven(num);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenIsPositiveMinus2thenFalse() {
        int num = -2;
        boolean result = LogicNot.isPositive(num);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotEven5thenTrue() {
        int num = 5;
        boolean result = LogicNot.notEven(num);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotPositive7thenFalse() {
        int num = 7;
        boolean result = LogicNot.notPositive(num);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotEvenAndPositive4thenFalse() {
        int num = 4;
        boolean result = LogicNot.notEvenAndPositive(num);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEvenOrNotPositive5thenFalse() {
        int num = 5;
        boolean result = LogicNot.evenOrNotPositive(num);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }
}