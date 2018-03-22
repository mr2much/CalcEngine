package com.lockward.anubis;

public class Main {

    public static void main(String[] args) {
        //useMathEquation();
        //useCalculatorBase();

        String[] statements = {
                "divide 100.0 50.0",    // 100.0 / 50.0 = 2
                "add 25.0 92.0",        // 25.0 + 92.0 = 117.0
                "subtract 225.0 17.0",  // 225.0 - 17.0 = 108.0
                "multiply 11.0 3.0"     // 11.0 * 3.0 = 33.0
        };

        CalculatorHelper helper = new CalculatorHelper();

        for (String statement : statements) {
            helper.process(statement);
            System.out.println(helper);
        }
    }

    public static void useMathEquation() {
        MathEquation[] equations = new MathEquation[4];

        equations[0] = new MathEquation('d', 100.0, 50.0);
        equations[1] = new MathEquation('a', 25.0, 92.0);
        equations[2] = new MathEquation('s', 225.0, 17.0);
        equations[3] = new MathEquation('m', 11.0, 3.0);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("The result is ");
            System.out.println(equation.getResult());
        }
    }

    public static void useCalculatorBase() {
        System.out.println();
        System.out.println("Using inheritance. ");
        System.out.println();

        Operation[] operations = {new Division(100.0d, 50.0d),
                new Addition(25.0d, 92.0d), new Subtraction(225, 17),
                new Multiplication(11, 3)};

        for(Operation operation : operations) {
            operation.calculate();

            System.out.print("The result is ");
            System.out.println(operation.getResult());
        }
    }

//    public static MathEquation create(double leftVal, double rightVal, char opCode) {
//        MathEquation equation = new MathEquation();
//
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }
}
