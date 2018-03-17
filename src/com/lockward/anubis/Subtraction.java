package com.lockward.anubis;

public class Subtraction extends Operation {

    public Subtraction() {}

    public Subtraction(double leftVal, double rightVal) { super(leftVal, rightVal); }

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();

        setResult(value);
    }
}
