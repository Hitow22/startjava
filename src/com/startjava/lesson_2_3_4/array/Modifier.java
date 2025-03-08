package com.startjava.lesson_2_3_4.array;

public class Modifier {
    public static void main(String[] args) {
        Modifier mod = new Modifier();

        int index = -1;
        float[] original = mod.fillWithRandomNumbers();
        float[] changed = mod.removeNumbersAboveIndex(original, index);
        mod.print(original, changed, index);

        index = 15;
        original = mod.fillWithRandomNumbers();
        changed = mod.removeNumbersAboveIndex(original, index);
        mod.print(original, changed, index);

        index = 0;
        original = mod.fillWithRandomNumbers();
        changed = mod.removeNumbersAboveIndex(original, index);
        mod.print(original, changed, index);

        index = 14;
        original = mod.fillWithRandomNumbers();
        changed = mod.removeNumbersAboveIndex(original, index);
        mod.print(original, changed, index);
    }

    private float[] fillWithRandomNumbers() {
        float[] random = new float[15];
        int length = random.length;
        for (int i = 0; i < length; i++) {
            random[i] = (float) Math.random();
        }
        return random;
    }

    private float[] removeNumbersAboveIndex(float[] original, int index) {
        int length = original.length;
        float[] changed = new float[length];

        if (index >= 0 && index < length) {
            int counter = 0;
            for (float number : original) {
                if (number > original[index]) {
                    changed[counter++] = 0;
                } else {
                    changed[counter++] = number;
                }
            }
        } else changed = original;
        return changed;
    }

    private void print(float[] original, float[] changed, int index) {
        int length = original.length;
        if (index >= 0 && index < length) {
            System.out.println("\nИсходный массив ");
            printArrays(original);

            System.out.println("\nИзмененный массив ");
            printArrays(changed);
            System.out.print("\nЗначение из ячейки " + index + " ");
            System.out.printf("%.3f ", original[index]);
            int zeroCount = countZeros(changed);
            System.out.println("\nКоличество обнуленных ячеек " + zeroCount);
        } else {
            System.out.println("\nОшибка: неверный индекс " + index + ". Введите значение от 0 до 14");
        }
    }

    private void printArrays(float[] array) {
        int counter = 0;
        for (float number : array) {
            if (counter != 8) {
                System.out.printf("%.3f ", number);
            } else {
                System.out.printf("%n%.3f ", number);
            }
            counter++;
        }
    }

    private int countZeros(float[] numbers) {
        int zeroCount = 0;
        for (float number : numbers) {
            if (number == 0) zeroCount++;
        }
        return zeroCount;
    }
}
