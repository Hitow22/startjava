package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        FactorialCalculator fc = new FactorialCalculator();

        long[] factorial = fc.calculate();
        fc.print(new int[]{}, factorial);

        factorial = fc.calculate(null);
        fc.print(null, factorial);

        factorial = fc.calculate(8, 0, 9);
        fc.print(new int[]{8, 0, 9}, factorial);

        factorial = fc.calculate(-3, 1, 7, 13);
        fc.print(new int[]{-3, 1, 7, 13}, factorial);

        factorial = fc.calculate(-22, -0);
        fc.print(new int[]{-22, -0}, factorial);
    }

    private long[] calculate(int... numbers) {
        if (numbers == null) return null;

        int length = numbers.length;
        long[] factorialNumbers = new long[length];
        int index = 0;
        for (long number : numbers) {
            if (number > 0) {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                factorialNumbers[index++] = factorial;
            } else if (number == 0) {
                factorialNumbers[index] = 1;
            }
        }
        return factorialNumbers;
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
                        for (int i = 1; i <= number; i++) {
                            String result = (i != number) ?
                                    (i + " * ") :
                                    (i + " = " + factorial[index] + "\n");
                            System.out.print(result);
                        }
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

