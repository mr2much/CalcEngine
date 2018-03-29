package com.lockward.anubis.calcengine;

public class Addition extends Operation {

    public Addition() {}

    public Addition(double leftVal, double rightVal) { super(leftVal, rightVal); }

    @Override
    public void calculate() {
        setResult(getLeftVal() + getRightVal());
    }
}