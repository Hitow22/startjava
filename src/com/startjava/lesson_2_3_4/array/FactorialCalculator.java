package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        FactorialCalculator fc = new FactorialCalculator();

        int[] numbers = new int[]{};
        long[] factorials = fc.calculate(numbers);
        fc.print(numbers, factorials);

        factorials = fc.calculate(null);
        fc.print(null, factorials);

        numbers = new int[]{8, 0, 9};
        factorials = fc.calculate(numbers);
        fc.print(numbers, factorials);

        numbers = new int[]{-3, 1, 7, 13};
        factorials = fc.calculate(numbers);
        fc.print(numbers, factorials);

        numbers = new int[]{-22, -0};
        factorials = fc.calculate(numbers);
        fc.print(numbers, factorials);
    }

    private long[] calculate(int... numbers) {
        if (numbers == null) return null;

        int length = numbers.length;
        long[] factorials = new long[length];
        int index = 0;
        for (long number : numbers) {
            if (number > 0) {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                factorials[index++] = factorial;
            } else if (number == 0) {
                factorials[index] = 1;
            }
        }
        return factorials;
    }

    private void print(int[] original, long[] factorial) {
        if (original != null || factorial != null) {
            int index = 0;
            for (int number : original) {
                if (number > 0) {
                    System.out.print(number + "! = ");
                    if (number == 1) {
                        System.out.println("1");
                    } else {
                        StringBuilder expr = new StringBuilder();
                        for (int i = 1; i <= number; i++) {
                            expr = (i != number) ?
                                   (expr.append(i).append(" * ")) :
                                   (expr.append(i).append(" = ").append(factorial[index]).append("\n"));
                        }
                        System.out.print(expr);
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

