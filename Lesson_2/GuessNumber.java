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
        int currPlayer = 0;
        while (true) {
            if (currPlayer == 0) {
                System.out.println("Ход игрока " + player1.getName());
                System.out.println("Введите число: ");
                player1.setGuessNumber(input.nextInt());
                if (player1.getGuessNumber() == computerNumber) {
                    System.out.println("Победил игрок " + player1.getName());
                    break;
                }

                if (player1.getGuessNumber() > computerNumber) {
                    System.out.println(player1.getGuessNumber() + " больше того, что загадал компьютер.");
                } else {
                    System.out.println(player1.getGuessNumber() + " меньше того, что загадал компьютер.");
                }
            } else {
                System.out.println("Ход игрока " + player2.getName());
                System.out.println("Введите число: ");
                player2.setGuessNumber(input.nextInt());
                if (player2.getGuessNumber() == computerNumber) {
                    System.out.println("Победил игрок " + player2.getName());
                    break;
                }

                if (player2.getGuessNumber() > computerNumber) {
                    System.out.println(player2.getGuessNumber() + " больше того, что загадал компьютер.");
                } else {
                    System.out.println(player2.getGuessNumber() + " меньше того, что загадал компьютер.");
                }
            }
            currPlayer = 1 - currPlayer;
        }
    }
}

