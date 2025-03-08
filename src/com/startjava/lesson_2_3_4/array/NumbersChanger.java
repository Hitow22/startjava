package com.startjava.lesson_2_3_4.array;

public class NumbersChanger {
    public static void main(String[] args) {
        NumbersChanger ch = new NumbersChanger();

        double[] original;
        double[] changed;

        int index = -1;
        original = ch.fill();
        changed = ch.removeByIndex(original, index);
        ch.print(original, changed, index);

        index = 15;
        original = ch.fill();
        changed = ch.removeByIndex(original, index);
        ch.print(original, changed, index);

        index = 0;
        original = ch.fill();
        changed = ch.removeByIndex(original, index);
        ch.print(original, changed, index);

        index = 14;
        original = ch.fill();
        changed = ch.removeByIndex(original, index);
        ch.print(original, changed, index);
    }

    private double[] fill() {
        double[] random = new double[15];
        int length = random.length;
        for (int i = 0; i < length; i++) {
            random[i] = Math.random();
        }
        return random;
    }

    private double[] removeByIndex(double[] original, int index) {
        int length = original.length;
        double[] changed = new double[length];

        if (index != 0) {
            for (int i = 0; i < length; i++) {
                if (original[i] > index) {
                    changed[i] = 0;
                }
            }
        } else changed = original;
        return changed;
    }

    private void print(double[] original, double[] changed, int index) {
        int length = original.length;
        if (index >= 0 && index < length) {
            System.out.println("\nИсходный массив = ");
            printArrays(original);

            System.out.println("\nИзмененный массив = ");
            printArrays(changed);
            System.out.print("\nЗначение из ячейки " + index + " = ");
            System.out.printf("%.3f ", original[index]);
            int zeroCount = countZeros(changed);
            System.out.println("\nКоличество обнуленных ячеек = " + zeroCount);
        } else {
            System.out.println("\nОшибка: неверный индекс " + index + ". Введите значение от 0 до 14");
        }
    }

    private void printArrays(double[] array) {
        int counter = 0;
        for (double number : array) {
            if (counter != 8) {
                System.out.printf("%.3f ", number);
            } else {
                System.out.printf("%n%.3f ", number);
            }
            counter++;
        }
    }

    private int countZeros(double[] numbers) {
        int zeroCount = 0;
        for (double number : numbers) {
            if (number == 0) zeroCount++;
        }
        return zeroCount;
    }
}
