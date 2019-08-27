package com.pluralsight.calcengine;

public interface MathProcessing {
    String SEPARATOR = " ";

    String getKeywork(); // add

    char getSymbol(); // +

    double doCalculation(double leftVal, double rightVal);
}
