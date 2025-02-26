package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public double calculate(int firstNumber, int secondNumber, char mathOperator) {
        double result;

        switch (mathOperator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("Деление на ноль запрещено");
                }
                result = (double) firstNumber / secondNumber;
                break;
            case '^':
                result = Math.pow(firstNumber, secondNumber);
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            default:
                throw new IllegalArgumentException("Операция " + mathOperator + " не поддерживается");
        }

        return result;
    }
}



