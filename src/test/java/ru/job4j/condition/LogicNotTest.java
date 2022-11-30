package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class LogicNotTest {

    @Test
    public void whenIsEven() {
        int num = 2;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isTrue();

    }

    @Test
    public void whenIsPositiveMinus2() {
        int num = -2;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEven() {
        int num = 5;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotPositive7() {
        int num = 7;
        boolean result = LogicNot.notPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPositive4() {
        int num = 4;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenEvenOrNotPositive5() {
        int num = 5;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertThat(result).isFalse();
    }
}