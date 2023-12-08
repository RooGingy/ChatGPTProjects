
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
            System.out.println("E = Easy      (7 attempts)");
            System.out.println("M = Meduim    (5 attempts)");
            System.out.println("H = Hard      (3 attempts)");
            System.out.println("N = Nightmare (1 attempt) ");
            System.out.println();
            difficulty = input.next().charAt(1);
            difficulty = Character.toUpperCase(difficulty);
        } while(!(difficulty == 'E' || difficulty == 'M'|| difficulty == 'H' || difficulty == 'N'));

        switch(difficulty){
            case 'E': attempts = 7; break;
            case 'M': attempts = 5; break;
            case 'H': attempts = 3; break;
            case 'N': attempts = 1; break;
        }

        do{
            do{
                System.out.println("Enter a number between 1 through 100");
                System.out.print("or enter 'X' to exit: ");
                user = input.nextLine();

            }while(!(user.equals("X")));
        }while(attempts!=0);
    }
}