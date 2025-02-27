package com.startjava.lesson_2_3_4.array;

public class ReverseArray {

    int[] reversedArray = new int[]{};

    public static void main(String[] args) {
        int[] zeroArray = new int[]{};
        int[] nullArray = null;
        int[] firstArray = new int[]{6, 8, 9, 1};
        int[] secondArray = new int[]{13, 8, 5, 3, 2, 1, 1};

        ReverseArray rev = new ReverseArray();
        rev.reverseNumbers(zeroArray);
        rev.printResult(zeroArray);
        rev.reverseNumbers(nullArray);
        rev.printResult(nullArray);
        rev.reverseNumbers(firstArray);
        rev.printResult(firstArray);
        rev.reverseNumbers(secondArray);
        rev.printResult(secondArray);
    }

    public void reverseNumbers(int[] numbers) {
        if (numbers != null) {
            reversedArray = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                reversedArray[i] = numbers[numbers.length - 1 - i];
            }
        }
    }

    public void printResult(int[] result) {
        if (result != null) {
            System.out.print("До реверса: [");
            for (int i = 0; i < result.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(result[i]);
            }
            System.out.println("]");

            System.out.print("После реверса: [");
            for (int i = 0; i < reversedArray.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(reversedArray[i]);
            }
            System.out.println("]");
        }
    }
}




