import java.util.Scanner;

public class GuessNumber {
    private static Player player1;
    private static Player player2;

    public static void startGame() {
        Scanner input = new Scanner(System.in);
        if (player1 == null || player2 == null) {
            System.out.println("Введите имя первого игрока:");
            player1 = new Player(input.nextLine());

            System.out.println("Введите имя второго игрока:");
            player2 = new Player(input.nextLine());
        }

        int originalNumber = 1 + (int) (Math.random() * 100);
        boolean isPlayer1Turn = true;
        while (player1.getGuessNumber() != originalNumber && player2.getGuessNumber() != originalNumber) {
            if (isPlayer1Turn) {
                System.out.println("Ход игрока " + player1.getName());
                System.out.println("Введите число: ");
                player1.setGuessNumber(input.nextInt());
                if (player1.getGuessNumber() > originalNumber) {
                    System.out.println(player1.getGuessNumber() + " больше того, что загадал компьютер.");
                } else if (player1.getGuessNumber() < originalNumber) {
                    System.out.println(player1.getGuessNumber() + " меньше того, что загадал компьютер.");
                } else {
                    System.out.println("Победил игрок " + player1.getName());
                    break;
                }
            } else {
                System.out.println("Ход игрока " + player2.getName());
                System.out.println("Введите число: ");
                player2.setGuessNumber(input.nextInt());
                if (player2.getGuessNumber() > originalNumber) {
                    System.out.println(player2.getGuessNumber() + " больше того, что загадал компьютер.");
                } else if (player2.getGuessNumber() < originalNumber) {
                    System.out.println(player2.getGuessNumber() + " меньше того, что загадал компьютер.");
                } else {
                    System.out.println("Победил игрок " + player2.getName());
                    break;
                }
            }
            isPlayer1Turn = !isPlayer1Turn;
        }
    }
}

