package com.startjava.Lesson_1.final_;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int originalNumber = random.nextInt(1, 101);
        Scanner input = new Scanner(System.in);
        int guessNumber;
        do {
            System.out.print("Введите число : ");
            guessNumber = input.nextInt();

            if (guessNumber > originalNumber) {
                System.out.println(guessNumber + " больше того, что загадал компьютер.");
            } else if (guessNumber < originalNumber) {
                System.out.println(guessNumber + " меньше того, что загадал компьютер.");
            }
        } while (guessNumber != originalNumber);

        System.out.println("Вы победили!");
    }
}
