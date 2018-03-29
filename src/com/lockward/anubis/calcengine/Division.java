package com.lockward.anubis.calcengine;

public class Division extends Operation {

    public Division() {}

    public Division(double leftVal, double rightVal) { super(leftVal, rightVal); }

    @Override
    public void calculate() {
        setResult(getRightVal() != 0 ? getLeftVal() / getRightVal() : 0.0);
    }
}
