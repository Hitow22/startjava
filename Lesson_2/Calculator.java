public class Calculator {
    public double calculate(int firstNumber, int secondNumber, char operator) {
        double result = 0;

        switch (operator) {
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
                if (secondNumber != 0) {
                    result = (double) firstNumber / secondNumber;
                    break;
                } else {
                    System.out.println("Деление на ноль запрещено");
                    System.exit(0);
                    break;
                }
            case '^':
                result = Math.pow(firstNumber, secondNumber);
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.println("Операция " + operator + " не поддерживается");
                System.exit(0);
        }

        return result;
    }
}



