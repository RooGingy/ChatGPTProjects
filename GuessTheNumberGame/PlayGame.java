
/**
 * Gussing game where bot chooses a random number between 1-100 and you are to guess what number it is.
 *
 * @author RooGingy
 * @version 12/06/2023
 * 
 */

import java.util.*;
import java.lang.*;

public class PlayGame
{
    /**
     * Random Number generator:
     * <p>
     * Picks a number between 1 and 100.
     * 
     * @return returns a random number between 1 though 10
     */
    public static int random(){
        return (int)(Math.random() * (10 - 1)) + 1;
    }

    /**
     * Score:
     * <p>
     * Creates a string for to diplay score.
     * 
     * @param userWins gets the amount of user wins.
     * @param botWins gets the amount of bot wins.
     * @return diplays the score.
     */
    public static String attempts(int attempts){
        return "Attempt: " + attempts;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int user = 0;
        System.out.println("Guess the correct number between 1 though 100.");
        do{
            int random = random(); // Generate a new random number.
            int attempts = 1; // reset attempt to 1
            System.out.println(attempts(attempts));
            System.out.print("Enter a number: ");
            user = input.nextInt();

            while(!(user == random || attempts == 10))
            {
                attempts++;
                if(user < random){
                    System.out.println("Number Is Too Low!");
                    System.out.println(attempts(attempts));
                    System.out.print("Try Again: ");
                    user = input.nextInt();
                }
                else if(user > random){
                    System.out.println("Number Is Too High!");
                    System.out.println(attempts(attempts));
                    System.out.print("Try Again: ");
                    user = input.nextInt();
                }
            }
        } while(user != -1);
    }
}