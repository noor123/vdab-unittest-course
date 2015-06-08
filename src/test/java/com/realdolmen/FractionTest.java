package com.realdolmen;

import Exercises.Fraction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class FractionTest {
    int numerator;
    int denumerator;
    String value;
    int numeratorAfterSimplify;
    int denumeratorAfterSimplify;
    int numeratorEqual;
    int denumeratorEqual;
    int numeratorNotEqual;
    int denumeratorNotEqual;

    public FractionTest(int numerator, int denumerator, String value, int numeratorAfterSimplify,
                        int denumeratorAfterSimplify, int numeratorEqual, int denumeratorEqual,
                        int numeratorNotEqual, int denumeratorNotEqual) {
        this.numerator = numerator;
        this.denumerator = denumerator;
        this.value = value;
        this.numeratorAfterSimplify = numeratorAfterSimplify;
        this.denumeratorAfterSimplify = denumeratorAfterSimplify;
        this.numeratorEqual = numeratorEqual;
        this.denumeratorEqual = denumeratorEqual;
        this.numeratorNotEqual = numeratorNotEqual;
        this.denumeratorNotEqual = denumeratorNotEqual;
    }

    @Parameterized.Parameters
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {5,8,"5 / 8", 5, 8, 15, 24, 15, 25},
                {3,7,"3 / 7", 3, 7, 9, 21, 9, 22},
                {2,4,"2 / 4", 1, 2, 1, 2, 5, 44},
                {49,14,"49 / 14", 7, 2, 7, 2, 2, 15},
                {21,28,"21 / 28",3, 4, 3, 4, 4, 3},
                {11,121,"11 / 121", 1, 11, 22, 242, 54, 12},
                {0,0,"0 / 0", 0, 0, 5, 0, 0, 6},
                {0,17,"0 / 17", 0, 17, 0, 3, 1, 3},
                {11,0,"11 / 0", 11, 0, 22, 0, 4, 1},
                {1,20,"1 / 20", 1, 20, 7, 140, 6, 140},
                {24,1,"24 / 1", 24, 1, 48, 2, 48, 3},
        });
    }

    @Test
    public void testToString() {
        assertEquals(value, new Fraction(numerator, denumerator).toString());
    }

    @Test
    public void testSimplify() {
        Fraction fraction001 = new Fraction(numerator, denumerator);
        fraction001.simplify();
        assertEquals(numeratorAfterSimplify, fraction001.getNumerator());
        assertEquals(denumeratorAfterSimplify, fraction001.getDenominator());
    }

    @Test
    public void testEquals() {
        assertTrue(new Fraction(numerator, denumerator).equals(new Fraction(numeratorEqual, denumeratorEqual)));
        assertFalse(new Fraction(numerator, denumerator).equals(new Fraction(numeratorNotEqual, denumeratorNotEqual)));
    }


}
