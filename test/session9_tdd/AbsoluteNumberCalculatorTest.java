package session9_tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("Testing add 0 and 0")
    public void testAdd0And0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 1 and 1")
    public void testAdd1And1() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 1 and -1")
    public void testAdd1AndMinus1() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}