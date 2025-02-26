package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(input.nextLine());
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(input.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);

        String answer;
        do {
            game.startGame();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = input.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
