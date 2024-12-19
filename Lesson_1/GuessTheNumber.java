import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int originNumber = random.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число : ");
        int guessNumber = input.nextInt();
        while (guessNumber != originNumber) {
            if (guessNumber > originNumber) {
                System.out.println(guessNumber + " больше того, что загадал компьютер" +
                        "\nВведите число : ");
            } else {
                System.out.println(guessNumber + " меньше того, что загадал компьютер" +
                        "\nВведите число : ");
            }
            guessNumber = input.nextInt();
        }
        System.out.println("Вы победили!");
    }
}
