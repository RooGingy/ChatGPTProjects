import java.util.*;

public class Main {
    public static int user;
    public static int botScore = 0;
    public static int userScore = 0;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("Bot: " + botScore + " User: " + userScore);
            message();
            while (user < 1 || user > 4) {
                System.out.println("Try again!");
                System.out.println();
                message();
            }
            int randomNumber = new Random().nextInt(3) + 1;

            if ((randomNumber == 1 && user == 1) ||
                    (randomNumber == 2 && user == 2) ||
                    (randomNumber == 3 && user == 3)) {
                System.out.println("Tied Game!");
                System.out.println();
            } else if (randomNumber == 1 && user == 3) {
                System.out.println("You Lost!");
                System.out.println("Bot Choose Rock!");
                System.out.println();
                botScore++;
            } else if (randomNumber == 2 && user == 1) {
                System.out.println("You Lost!");
                System.out.println("Bot Choose Paper");
                System.out.println();
                botScore++;
            } else if (randomNumber == 3 && user == 2) {
                System.out.println("You Lost!");
                System.out.println("Bot Choose Scissors");
                System.out.println();
                botScore++;
            } else {
                if (user != 4) {
                    System.out.println("You Win!");
                    System.out.println();
                    userScore++;
                }
            }
        } while (user != 4);

        System.out.println("Game Ended!");
    }

    public static void message() {
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.println("4 = End Game");
        System.out.print("Choose a number: ");
        user = input.nextInt();
        System.out.println();
    }
}