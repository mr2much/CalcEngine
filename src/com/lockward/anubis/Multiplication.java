package com.lockward.anubis;

public class Multiplication extends Operation {

    public Multiplication() {}

    public Multiplication(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        setResult( getLeftVal() * getRightVal());
    }
}
