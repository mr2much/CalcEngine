package com.lockward.anubis;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - Invalid opCode");
                result = 0;
                break;
        }
    }
}
