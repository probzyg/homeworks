package io.codelex.exceptions.practice;

public class Exercise2 {
    public void methodA() throws ArithmeticException {
        try {
            methodB();
        }
        catch (ArithmeticException exception) {
            exception.printStackTrace();
            throw exception;
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        }
        catch (ArithmeticException exception) {
            exception.printStackTrace();
            throw exception;
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            int num = 10;
            int div = 0;
            int result = num / div;
        }
        catch (ArithmeticException exception) {
            exception.printStackTrace();
            throw exception;
        }
    }
}
