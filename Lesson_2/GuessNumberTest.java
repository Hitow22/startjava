import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        do {
            GuessNumber.startGame();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = input.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
