package com.lockward.anubis.calcengine;

public class Division extends Operation {

    public Division() {}

    public Division(double leftVal, double rightVal) { super(leftVal, rightVal); }

    @Override
    public void calculate() {
        setResult(getRightVal() != 0 ? getLeftVal() / getRightVal() : 0.0);
    }

    @Override
    public String getKeyWord() {
        return "divide";
    }

    @Override
    public char getSymbol() {
        return '/';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
