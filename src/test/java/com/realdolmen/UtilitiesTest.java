package com.realdolmen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilitiesTest {
    @Test
    public void greatestCommonFactorReturnsGreatestCommonFactorForNormalValues() {
        assertEquals(8, Utilities.greatestCommonFactor(24, 16));
        assertEquals(4, Utilities.greatestCommonFactor(48, 100));
    }

    @Test
    public void greatestCommonFactorReturnsOneIfAnyParameterIsZero() {
        assertEquals(1, Utilities.greatestCommonFactor(0, 2));
        assertEquals(1, Utilities.greatestCommonFactor(10, 0));
    }

    @Test
    public void greatestCommonFactorAlwaysReturnsPositiveValues() throws Exception {
        assertEquals(2, Utilities.greatestCommonFactor(2, 4));
        assertEquals(2, Utilities.greatestCommonFactor(-2, 4));
        assertEquals(2, Utilities.greatestCommonFactor(2, -4));
        assertEquals(2, Utilities.greatestCommonFactor(-2, -4));
    }

    @Test
    public void extraTest1() throws Exception {
        assertEquals(28, Utilities.greatestCommonFactor(28, 28));
    }


    @Test
    public void extraTest2() throws Exception {
        assertEquals(28, Utilities.greatestCommonFactor(28, 28));
    }

    @Test
    public void extraTest3() throws Exception {
        assertEquals(28, Utilities.greatestCommonFactor(28, 28));
    }

    @Test
    public void extraTest4() throws Exception {
        assertEquals(28, Utilities.greatestCommonFactor(28, 28));
    }
}
