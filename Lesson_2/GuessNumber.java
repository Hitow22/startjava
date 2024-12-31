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

