package com.lockward.anubis;

public abstract class Operation {
    private double leftVal;
    private double rightVal;
    private double result;

    public double getLeftVal() { return leftVal; }
    public void setLeftVal(double leftVal) { this.leftVal = leftVal; }
    public double getRightVal() { return rightVal; }
    public void setRightVal(double rightVal) { this.rightVal = rightVal; }
    public double getResult() { return result; }
    public void setResult(double result) { this.result = result; }

    public Operation() {}

    public Operation(double leftVal, double rightVal) {
        this.setLeftVal(leftVal);
        this.setRightVal(rightVal);
    }

    public abstract void calculate();
}
