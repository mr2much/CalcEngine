package com.lockward.anubis;

public class CalculatorHelper {
    private static final char ADD_SIGN = '+';
    private static final char SUBTRACT_SIGN = '-';
    private static final char MULTIPLY_SIGN = '*';
    private static final char DIVIDE_SIGN = '/';

    private MathOperation operation;
    private double leftValue;
    private double rightValue;
    private double result;

    public void process(String statement) {
        // add 1.0 2.0
        String[] parts = statement.split(" ");
        String operationString = parts[0];              // add
        this.leftValue = Double.parseDouble(parts[1]);  // 1.0
        this.rightValue = Double.parseDouble(parts[2]); // 2.0

        setOperationFromString(operationString);

        Operation calculator = null;

        switch (operation) {
            case Add:
                calculator = new Addition(leftValue, rightValue);
                break;
            case Subtract:
                calculator = new Subtraction(leftValue, rightValue);
                break;
            case Multiply:
                calculator = new Multiplication(leftValue, rightValue);
                break;
            case Divide:
                calculator = new Division(leftValue, rightValue);
                break;
        }

        calculator.calculate();

        result = calculator.getResult();
    }

    private void setOperationFromString(String operationString) {
        // add -> MathOperation.Add
        if(operationString.equalsIgnoreCase(MathOperation.Add.toString())) {
            operation = MathOperation.Add;
        } else if (operationString.equalsIgnoreCase(MathOperation.Subtract.toString())) {
            operation = MathOperation.Subtract;
        } else if (operationString.equalsIgnoreCase(MathOperation.Multiply.toString())) {
            operation = MathOperation.Multiply;
        } else if (operationString.equalsIgnoreCase(MathOperation.Divide.toString())) {
            operation = MathOperation.Divide;
        }
    }

    @Override
    public String toString() {
        // 100.0 / 50.0 = 2
        char sign = ' ';

        switch (operation) {
            case Add:
                sign = ADD_SIGN;
                break;
            case Subtract:
                sign = SUBTRACT_SIGN;
                break;
            case Multiply:
                sign = MULTIPLY_SIGN;
                break;
            case Divide:
                sign = DIVIDE_SIGN;
                break;
        }

        return String.format("%.1f %c %.1f = %.1f", leftValue, sign, rightValue, result);
    }
}
