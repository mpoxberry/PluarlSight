package com.pluralsight.calcengine;

public class Adder extends CalculateBase implements MathProcessing {
    public Adder() {}

    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }

    @Override
    public String getKeywork() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setResult(rightVal);
        calculate();

        return getResult();
    }
}
