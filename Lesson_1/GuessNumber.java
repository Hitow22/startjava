import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int originalNumber = random.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число : ");
        int guessNumber = input.nextInt();
        while (guessNumber != originalNumber) {
            if (guessNumber > originalNumber) {
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
