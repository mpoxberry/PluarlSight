package com.pluralsight.calcengine;

/**
 * @author mpoxberry
 * created 19-07-2019s
 */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public void execute() {
        switch(opCode) {
            case 'a': {
                result = leftVal + rightVal;
                break;
            }
            case 's': {
                result = leftVal - rightVal;
                break;
            }
            case 'd': {
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
//            if (val2 != 0.0d) {
//                result = val1 / val2;
//            }
//            else {
//                result = 0.0d;
//            }
                break;
            }
            case 'm': {
                result = leftVal * rightVal;
                break;
            }
            default: {
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
            }
        }
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResult() {
        return result;
    }
}
