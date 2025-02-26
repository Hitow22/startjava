package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Введите первое число");
            int firstNumber = input.nextInt();
            System.out.println("Введите оператор вычисления (+, -, *, /, ^, %)");
            char mathOperator = input.next().charAt(0);
            System.out.println("Введите второе число");
            int secondNumber = input.nextInt();

            double result = calculator.calculate(firstNumber, secondNumber, mathOperator);
            System.out.println(firstNumber + " " + mathOperator + " " + secondNumber + " = " + result);

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = input.next();
            } while (!answer.equals("yes") && !answer.equals("no"));

        } while (answer.equals("yes"));
    }
}
