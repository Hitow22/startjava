package com.startjava.lesson_2_3_4.array;

public class Changer {
    public static void main(String[] args) {
        Changer ch = new Changer();

        double[] original;
        double[] changed;

        int index = -1;
        original = ch.fill();
        changed = ch.remove(original, index);
        ch.print(original, changed, index);

        index = 15;
        original = ch.fill();
        changed = ch.remove(original, index);
        ch.print(original, changed, index);

        index = 0;
        original = ch.fill();
        changed = ch.remove(original, index);
        ch.print(original, changed, index);

        index = 14;
        original = ch.fill();
        changed = ch.remove(original, index);
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

    private double[] remove(double[] original, int index) {
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
        int counter = 0;

        if (index >= 0 && index < length) {
            System.out.print("Исходный массив = ");
            for (double number : original) {
                if (counter != 8) {
                    System.out.printf("%.3f ", number);
                } else {
                    System.out.printf("%n%.3f ", number);
                }
                counter++;
            }
            counter = 0;
            int zeroCount = 0;
            System.out.print("\nИзмененный массив = ");
            for (double number : changed) {
                if (number == 0) zeroCount++;

                if (counter != 8) {
                    System.out.printf("%.3f ", number);
                } else {
                    System.out.printf("%n%.3f ", number);
                }
                counter++;
            }
            System.out.println("\nЗначение из ячейки по переданному индексу = " + original[index]);
            System.out.println("Количество обнуленных ячеек = " + zeroCount);
        } else System.out.println("Ошибка: указан неверный индекс");
    }
}
