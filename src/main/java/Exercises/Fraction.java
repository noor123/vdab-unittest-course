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

    @Override
    public boolean equals(Object obj) {
        return this.equals((Fraction)obj);
    }

    public boolean equals(Fraction otherFraction) {
        int a = this.getNumerator();
        int b = this.getDenominator();
        int c = otherFraction.getNumerator();
        int d = otherFraction.getDenominator();
        Fraction x = new Fraction(a,b);
        Fraction y = new Fraction(c,d);
        x.simplify();
        y.simplify();
        if ((x.getNumerator() == y.getNumerator()) && (x.getDenominator() == y.getDenominator())) {
            return true;
        } else {
            return false;
        }
    }

    public double asDouble() {
        return (double)this.getNumerator() / this.getDenominator();
    }

    public String toString() {
        return numerator + " / " + denominator;
    }

}
