package Exercises;

import com.realdolmen.Utilities;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void simplify() {
            int deler = Utilities.greatestCommonFactor(numerator, denominator);
            this.numerator = numerator / deler;
            this.denominator = denominator / deler;
    }

    public String toString() {
        return numerator + " / " + denominator;
    }

}
