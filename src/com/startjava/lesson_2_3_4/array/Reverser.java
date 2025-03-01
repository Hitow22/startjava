package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        Reverser rev = new Reverser();

        int[] zeroArray = new int[]{};
        int[] reversedArray = rev.reverseNumbers(zeroArray);
        rev.printArray(zeroArray, reversedArray);

        int[] nullArray = null;
        reversedArray = rev.reverseNumbers(nullArray);
        rev.printArray(nullArray, reversedArray);

        int[] firstArray = new int[]{6, 8, 9, 1};
        reversedArray = rev.reverseNumbers(firstArray);
        rev.printArray(firstArray, reversedArray);

        int[] secondArray = new int[]{13, 8, 5, 3, 2, 1, 1};
        reversedArray = rev.reverseNumbers(secondArray);
        rev.printArray(secondArray, reversedArray);
    }

    private int[] reverseNumbers(int[] numbers) {
        if (numbers == null) {
            return null;
        }

        int length = numbers.length;
        int[] reversedArray = new int[length];
        int counter = 0;
        for (int number : numbers) {
            reversedArray[length - 1 - counter] = number;
            counter++;
        }
        return reversedArray;
    }

    private void printArray(int[] originalArray, int[] reversedArray) {
        if (originalArray != null || reversedArray != null) {
            System.out.print("   До реверса: ");
            System.out.println(Arrays.toString(originalArray));

            System.out.print("После реверса: ");
            System.out.println(Arrays.toString(reversedArray));
        }
    }
}




