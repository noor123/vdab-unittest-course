package com.realdolmen;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(FractionTest.class);
    }


}
