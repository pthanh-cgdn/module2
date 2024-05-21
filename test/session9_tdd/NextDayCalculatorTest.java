package session9_tdd;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("Testing 28Feb2024")
    public void test28Feb2024(){
        Date day = new Date("Feb 28 2024");
        Date expected = new Date("Feb 29 2024");
        Date result = NextDayCalculator.getNextDay(day);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing 31Dec2024")
    public void test31Dec2024(){
        Date day = new Date("Dec 31 2024");
        Date expected = new Date("Jan 1 2025");
        Date result = NextDayCalculator.getNextDay(day);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing 21Apr2024")
    public void test21Apr2024(){
        Date day = new Date("Apr 21 2024");
        Date expected = new Date("Apr 22 2024");
        Date result = NextDayCalculator.getNextDay(day);
        assertEquals(expected, result);
    }
}