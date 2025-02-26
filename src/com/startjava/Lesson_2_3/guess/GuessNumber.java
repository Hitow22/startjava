package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Scanner input = new Scanner(System.in);
        int computerNumber = 1 + (int) (Math.random() * 100);
        Player currPlayer = player1;
        while (true) {
            System.out.println("Ход игрока " + currPlayer.getName());
            System.out.println("Введите число: ");
            currPlayer.setGuessNumber(input.nextInt());
            if (currPlayer.getGuessNumber() == computerNumber) {
                System.out.println("Победил игрок " + currPlayer.getName());
                break;
            }

            if (currPlayer.getGuessNumber() > computerNumber) {
                System.out.println(currPlayer.getGuessNumber() + " больше того, что загадал компьютер.");
            } else {
                System.out.println(currPlayer.getGuessNumber() + " меньше того, что загадал компьютер.");
            }

            if (currPlayer == player1) {
                currPlayer = player2;
            } else {
                currPlayer = player1;
            }
        }
    }
}

