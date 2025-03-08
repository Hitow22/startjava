package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        FactorialCalculator fc = new FactorialCalculator();

        int[] zeroNumbers = {};
        long[] factorials = fc.calculate(zeroNumbers);
        fc.print(zeroNumbers, factorials);

        factorials = fc.calculate(null);
        fc.print(null, factorials);

        int[] firstNumbers = {8, 0, 9};
        factorials = fc.calculate(firstNumbers);
        fc.print(firstNumbers, factorials);

        int[] secondNumbers = {-3, 1, 7, 13};
        factorials = fc.calculate(secondNumbers);
        fc.print(secondNumbers, factorials);

        int[] thirdNumbers = {-22, -0};
        factorials = fc.calculate(thirdNumbers);
        fc.print(thirdNumbers, factorials);
    }

    private long[] calculate(int... numbers) {
        if (numbers == null) return null;

        int length = numbers.length;
        long[] factorials = new long[length];
        int index = 0;
        for (long number : numbers) {
            if (number <= 0) continue;

            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            factorials[index++] = factorial;
        }
        return factorials;
    }

    private void print(int[] original, long[] factorials) {
        if (original == null || factorials == null) {
            System.out.println("Ошибка: массив равен null");
            return;
        }

        int length = original.length;
        if (length == 0) {
            System.out.println("Ошибка: длина массива равна 0");
            return;
        }

        int index = 0;
        for (int number : original) {
            if (number > 0) {
                System.out.print(number + "! = ");
                if (number == 1) {
                    System.out.println("1");
                } else {
                    StringBuilder expr = new StringBuilder();
                    for (int i = 1; i <= number; i++) {
                        expr.append(i != number ? i + " * " : i + " = " + factorials[index] + "\n");
                    }
                    System.out.print(expr);
                }
                index++;
            } else if (number == 0) {
                System.out.println(number + "! = 1");
            } else {
                System.out.println("Ошибка: факториал " + number + "! не определен");
            }
        }
    }
}

