package com.lockward.anubis.calcengine;

import jdk.internal.org.objectweb.asm.Handle;

public class DynamicHelper {
    private MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers) {
        this.handlers = handlers;
    }

    public String process(String statement) throws InvalidStatementException {
        // IN: add 1.0 20.0
        // OUT: 1.0 + 2.0 = 3.0

        String[] parts = statement.split(MathProcessing.SEPARATOR);

        if(parts.length != 3) {
            throw new InvalidStatementException("Not enough parts", statement);
        }

        String keyword = parts[0]; // add

        MathProcessing theHandler = null;

        for (MathProcessing handle: handlers) {
            if (keyword.equalsIgnoreCase(handle.getKeyWord())) {
                theHandler = handle;
                break;
            }
        }

        double leftVal = 0.0;
        double rightVal = 0.0;

        try {
            leftVal = Double.parseDouble(parts[1]);  // 1.0
            rightVal = Double.parseDouble(parts[2]); // 2.0
        } catch (NumberFormatException ex) {
            throw new InvalidStatementException("Non numeric data", statement, ex);
        }

        if(theHandler == null) {
            throw new InvalidStatementException("Invalid operation", statement);
        }

        double result = theHandler.doCalculation(leftVal, rightVal);

        return String.format("%.1f %c %.1f = %.1f", leftVal, theHandler.getSymbol(), rightVal, result);
    }
}
