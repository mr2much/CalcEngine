package com.lockward.anubis.calcengine;

public class Subtraction extends Operation {

    public Subtraction() {}

    public Subtraction(double leftVal, double rightVal) { super(leftVal, rightVal); }

    @Override
    public void calculate() {
        setResult(getLeftVal() - getRightVal());
    }
}