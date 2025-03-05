package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        Reverser rev = new Reverser();

        int[] zeroNumbers = {};
        int[] reversed = rev.reverse(zeroNumbers);
        rev.print(zeroNumbers, reversed);

        int[] nullNumbers = null;
        reversed = rev.reverse(nullNumbers);
        rev.print(nullNumbers, reversed);

        int[] firstNumbers = {6, 8, 9, 1};
        reversed = rev.reverse(firstNumbers);
        rev.print(firstNumbers, reversed);

        int[] secondNumbers = {13, 8, 5, 3, 2, 1, 1};
        reversed = rev.reverse(secondNumbers);
        rev.print(secondNumbers, reversed);
    }

    private int[] reverse(int[] numbers) {
        if (numbers == null) return null;

        int length = numbers.length;
        int[] reversedArray = new int[length];
        for (int number : numbers) {
            reversedArray[--length] = number;
        }
        return reversedArray;
    }

    private void print(int[] original, int[] reversed) {
        if (original != null || reversed != null) {
            System.out.print("   До реверса: ");
            System.out.println(Arrays.toString(original));

            System.out.print("После реверса: ");
            System.out.println(Arrays.toString(reversed));
        } else System.out.println("Ошибка: массив равен null");
    }
}




