package com.realdolmen;

import Exercises.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void testingVoidSimplify001() throws Exception {
        Fraction fraction001 = new Fraction(7,49);
        fraction001.simplify();
        assertEquals(1, fraction001.getNumerator());
        assertEquals(7, fraction001.getDenominator());
    }

    @Test
    public void testingVoidSimplify002() throws Exception {
        Fraction fraction001 = new Fraction(121,11);
        fraction001.simplify();
        assertEquals(11, fraction001.getNumerator());
        assertEquals(1, fraction001.getDenominator());
    }

    @Test
    public void testingVoidSimplify003() throws Exception {
        Fraction fraction001 = new Fraction(21,28);
        fraction001.simplify();
        assertEquals(3, fraction001.getNumerator());
        assertEquals(4, fraction001.getDenominator());
    }

    @Test
    public void testingVoidSimplify004() throws Exception {
        Fraction fraction001 = new Fraction(0,0);
        fraction001.simplify();
        assertEquals(0, fraction001.getNumerator());
        assertEquals(0, fraction001.getDenominator());
    }

    @Test
    public void testingVoidSimplify005() throws Exception {
        Fraction fraction001 = new Fraction(0,17);
        fraction001.simplify();
        assertEquals(0, fraction001.getNumerator());
        assertEquals(17, fraction001.getDenominator());
    }

    @Test
    public void testingVoidSimplify006() throws Exception {
        Fraction fraction001 = new Fraction(11,0);
        fraction001.simplify();
        assertEquals(11, fraction001.getNumerator());
        assertEquals(0, fraction001.getDenominator());
    }

    @Test
    public void testingVoidSimplify007() throws Exception {
        Fraction fraction001 = new Fraction(1,20);
        fraction001.simplify();
        assertEquals(1, fraction001.getNumerator());
        assertEquals(20, fraction001.getDenominator());
    }

    @Test
    public void testingVoidSimplify008() throws Exception {
        Fraction fraction001 = new Fraction(24,1);
        fraction001.simplify();
        assertEquals(24, fraction001.getNumerator());
        assertEquals(1, fraction001.getDenominator());
    }

    @Test
    public void testingStringToString() throws Exception {
        Fraction fraction001 = new Fraction(1542,342);
        assertEquals("1542 / 342", fraction001.toString());
    }

    @Test
    public void testingMethodEquals001() throws Exception {
        Fraction fraction001 = new Fraction(3,17);
        Fraction fraction002 = new Fraction(21,119);
        assertEquals(true, fraction001.equals(fraction002));
        assertEquals(3, fraction001.getNumerator());
        assertEquals(17, fraction001.getDenominator());
        assertEquals(21, fraction002.getNumerator());
        assertEquals(119, fraction002.getDenominator());
    }

    @Test
    public void testingMethodEquals002() throws Exception {
        Fraction fraction001 = new Fraction(4,7);
        Fraction fraction002 = new Fraction(16,17);
        assertEquals(4, fraction001.getNumerator());
        assertEquals(7, fraction001.getDenominator());
        assertEquals(16, fraction002.getNumerator());
        assertEquals(17, fraction002.getDenominator());
    }

    @Test
    public void testingMethodasDouble() throws Exception {
        Fraction fraction001 = new Fraction(4,7);
        assertEquals(0.571, (fraction001.asDouble()), 0.001);
    }


}
