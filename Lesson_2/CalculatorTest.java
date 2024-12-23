import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("Введите первое число");
            int firstNumber = input.nextInt();
            System.out.println("Введите оператор вычисления (+, -, *, /, ^, %)");
            char operator = input.next().charAt(0);
            System.out.println("Введите второе число");
            int secondNumber = input.nextInt();

            double result = calculator.calculate(firstNumber, secondNumber, operator);
            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

            String answer;
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = input.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
            if (answer.equals("no")) {
                continueCalculation = false;
            }
        }
    }
}
