package com.startjava.lesson_2_3_4.array;

public class ArrayInverter {
    public static void main(String[] args) {
        ArrayInverter inv = new ArrayInverter();

        int[] zeroArray = new int[]{};
        inv.reverseNumbers(zeroArray);
        inv.printResult(zeroArray);

        int[] nullArray = null;
        inv.reverseNumbers(nullArray);
        inv.printResult(nullArray);

        int[] firstArray = new int[]{6, 8, 9, 1};
        inv.reverseNumbers(firstArray);
        inv.printResult(firstArray);

        int[] secondArray = new int[]{13, 8, 5, 3, 2, 1, 1};
        inv.reverseNumbers(secondArray);
        inv.printResult(secondArray);
    }

    private int[] reverseNumbers(int[] numbers) {
        if (numbers == null) {
            return null;
        }

        int length = numbers.length;
        int[] reversedArray = new int[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = numbers[length - 1 - i];
        }
        return reversedArray;
    }

    private void printArray(int[] array, String description) {
        if (array != null) {
            int length = array.length;
            System.out.print(description + " [");
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(array[i]);
            }
            System.out.println("]");
        }
    }

    private void printResult(int[] result) {
        if (result != null) {
            printArray(result, "До реверса:");
            result = reverseNumbers(result);
            printArray(result, "После реверса:");
        }
    }
}




