package com.lockward.anubis.calcengine;

public class Multiplication extends Operation {

    public Multiplication() {}

    public Multiplication(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        setResult( getLeftVal() * getRightVal());
    }

    @Override
    public String getKeyWord() {
        return "multiply";
    }

    @Override
    public char getSymbol() {
        return '*';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
