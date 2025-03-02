package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        Reverser rev = new Reverser();

        int[] zeroNumbers = new int[]{};
        int[] reversedArray = rev.reverseNumbers(zeroNumbers);
        rev.printArray(zeroNumbers, reversedArray);

        int[] nullNumbers = null;
        reversedArray = rev.reverseNumbers(nullNumbers);
        rev.printArray(nullNumbers, reversedArray);

        int[] firstNumbers = new int[]{6, 8, 9, 1};
        reversedArray = rev.reverseNumbers(firstNumbers);
        rev.printArray(firstNumbers, reversedArray);

        int[] secondNumbers = new int[]{13, 8, 5, 3, 2, 1, 1};
        reversedArray = rev.reverseNumbers(secondNumbers);
        rev.printArray(secondNumbers, reversedArray);
    }

    private int[] reverseNumbers(int[] numbers) {
        if (numbers == null) {
            return null;
        }

        int length = numbers.length;
        int[] reversedArray = new int[length];
        for (int number : numbers) {
            length--;
            reversedArray[length] = number;
        }
        return reversedArray;
    }

    private void printArray(int[] originalArray, int[] reversedArray) {
        if (originalArray != null || reversedArray != null) {
            System.out.print("   До реверса: ");
            System.out.println(Arrays.toString(originalArray));

            System.out.print("После реверса: ");
            System.out.println(Arrays.toString(reversedArray));
        } else System.out.println("Ошибка: массив равен null");
    }
}




