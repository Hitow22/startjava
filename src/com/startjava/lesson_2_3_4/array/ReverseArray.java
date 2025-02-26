package com.startjava.lesson_4.array;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray rev = new ReverseArray();
        rev.reverseNumbers(new int[]{});
        rev.reverseNumbers(null);
        rev.reverseNumbers(new int[]{6, 8, 9, 1});
        rev.reverseNumbers(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    public void reverseNumbers(int[] numbers) {
        if (numbers != null) {
            System.out.print("До реверса: [");
            for (int num : numbers) {
                if (num != numbers[0]) {
                    System.out.print(" ");
                }
                System.out.print(num);
            }
            System.out.print("]");

            System.out.print("\n" + "После реверса: [");
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i]);
                if (i > 0) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }
}




