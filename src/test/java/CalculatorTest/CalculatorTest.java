package CalculatorTest;

import calculatoroefening.Calculator;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testWithNothingInString() {
        Calculator c = new Calculator();
        assertEquals(0, c.add(""));
    }

    @Test
    public void testWithOneNumberInString() {
        Calculator c = new Calculator();
        assertEquals(115, c.add("115"));
    }

    @Test
    public void testWithTwoNumbersInString() {
        Calculator c = new Calculator();
        assertEquals(249, c.add("15,234"));
        assertEquals(249, c.add("15\n234"));
    }

    @Test
    public void testWithMoreThenTwoNumbersInString() {
        Calculator c = new Calculator();
        assertEquals(306, c.add("15,234,56,1"));
        assertEquals(306, c.add("15\n234\n56\n1"));
        assertEquals(119, c.add("15,2\n34\n56,12"));
    }

    @Test
    public void testWithOwnDelimeter() {
        Calculator c = new Calculator();
        //assertEquals(306, c.add(//;;"15,234,56,1"));
    }


}
