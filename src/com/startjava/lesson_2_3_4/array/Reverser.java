package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        Reverser rev = new Reverser();

        int[] zeroArray = new int[]{};
        rev.reverseNumbers(zeroArray);
        rev.printResult(zeroArray);

        int[] nullArray = null;
        rev.reverseNumbers(nullArray);
        rev.printResult(nullArray);

        int[] firstArray = new int[]{6, 8, 9, 1};
        rev.reverseNumbers(firstArray);
        rev.printResult(firstArray);

        int[] secondArray = new int[]{13, 8, 5, 3, 2, 1, 1};
        rev.reverseNumbers(secondArray);
        rev.printResult(secondArray);
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

    private void printResult(int[] result) {
        if (result != null) {
            System.out.print("   До реверса: ");
            System.out.println(Arrays.toString(result));

            result = reverseNumbers(result);
            System.out.print("После реверса: ");
            System.out.println(Arrays.toString(result));
        }
    }
}




