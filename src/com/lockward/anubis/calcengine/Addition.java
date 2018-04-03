package com.lockward.anubis.calcengine;

public class Addition extends Operation {

    public Addition() {}

    public Addition(double leftVal, double rightVal) { super(leftVal, rightVal); }

    @Override
    public void calculate() {
        setResult(getLeftVal() + getRightVal());
    }

    @Override
    public String getKeyWord() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
