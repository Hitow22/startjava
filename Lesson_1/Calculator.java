import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = input.nextInt();
        System.out.println("Введите оператор вычисления");
        char operator = input.next().charAt(0);
        System.out.println("Введите второе число");
        int secondNumber = input.nextInt();
        int result = 0;
        if (operator == '+') {
            result = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + result);
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        } else if (operator == '/') {
            result = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + result);
        } else if (operator == '%') {
            result = firstNumber % secondNumber;
            System.out.println(firstNumber + " % " + secondNumber + " = " + result);
        } else if (operator == '^') {
            for (int i = 1; i < secondNumber; i++) {
                result = firstNumber * firstNumber;
            }
            System.out.println(firstNumber + " ^ " + secondNumber + " = " + result);
        }
    }
}

