package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        FactorialCalculator fc = new FactorialCalculator();

        long[] result = fc.calculate();
        fc.printResult(new int[]{}, result);

        result = fc.calculate(null);
        fc.printResult(null, result);

        result = fc.calculate(8, 0, 9);
        fc.printResult(new int[]{8, 0, 9}, result);

        result = fc.calculate(-3, 1, 7, 13);
        fc.printResult(new int[]{-3, 1, 7, 13}, result);

        result = fc.calculate(-22, -0);
        fc.printResult(new int[]{-22, -0}, result);
    }

    private long[] calculate(int... numbers) {
        if (numbers == null) {
            return null;
        }

        int length = numbers.length;
        long[] result = new long[length];
        int index = 0;
        for (long number : numbers) {
            if (number > 0) {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                result[index] = factorial;
                index++;
            } else if (number == 0) {
                result[index] = 1;
            } else result[index] = -1;
        }
        return result;
    }

    private void printResult(int[] originalNumbers, long[] factorialNumbers) {
        if (originalNumbers != null || factorialNumbers != null) {
            int index = 0;
            for (int number : originalNumbers) {
                if (number > 0) {
                    System.out.print(number + "! = ");
                    for (int i = 1; i <= number; i++) {
                        String result = (i != number) ?
                                (i + " * ") :
                                (i + " = " + factorialNumbers[index] + "\n");
                        System.out.print(result);
                    }
                    index++;
                } else {
                    String error = (number < 0) ?
                            ("Ошибка: факториал " + number + "! не определен") :
                            (number + "! = 1");
                    System.out.println(error);
                }
            }
        } else System.out.println("Ошибка: массив равен null");
    }
}

