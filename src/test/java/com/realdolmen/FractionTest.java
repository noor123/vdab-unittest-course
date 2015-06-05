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


}
