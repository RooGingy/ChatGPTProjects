
/**
 * Gussing game where bot chooses a random number between 1-100 and you are to guess what number it is.
 *
 * @author RooGingy
 * @version 12/06/2023
 * 
 */

import java.util.*;

public class PlayGame
{
    private int userWins = 0;
    private int botWins = 0;

    /**
     * Random Number Generater:
     * <p>
     * Generates a number between 1 and 100.
     * 
     * @return a random number between 1 though 100
     */
    public static int random(){
        return (int)(Math.random() * (100 - 1)) + 1;
    }

    /**
     * Attempts:
     * <p>
     * Create the amount of attempts a user has based on the level of difficuty the user has set difficulty
     * 
     * @return the number of attempts a person has.
     */
    public static int attempts(char difficulty){
        int attempts = 0;

        switch(difficulty){
            case 'E': attempts = 7; break;
            case 'M': attempts = 5; break;
            case 'H': attempts = 3; break;
            case 'N': attempts = 1; break;
        }

        return attempts;
    }

    /**
     * Difficutly:
     * <p>
     * User selects their difficutly they want at the beginning of each game.
     * 
     * @return level of difficulty.
     */
    public static char difficulty(){
        Scanner user = new Scanner(System.in);
        char difficulty = ' ';

        do{
            System.out.println("Select Game Difficulty:   ");
            System.out.println("E = Easy      (7 attempts)");
            System.out.println("M = Meduim    (5 attempts)");
            System.out.println("H = Hard      (3 attempts)");
            System.out.println("N = Nightmare (1 attempt) ");
            System.out.println();
            difficulty = user.next().charAt(1);
            difficulty = Character.toUpperCase(difficulty);
        } while(!(difficulty == 'E' || difficulty == 'M'|| difficulty == 'H' || difficulty == 'N'));

        return difficulty = Character.toUpperCase(difficulty);
    }

    /**
     * Incerment User Wins:
     * <p>
     * Adds one to user wins.
     * 
     * @param userWins
     * @return userWins
     */
    public static int incrementUserWins(int userWins){
        return userWins++;
    }

    /**
     * Incerment Bot Wins:
     * <p>
     * Adds one to bot wins.
     * 
     * @param botWins
     * @return botWins
     */
    public static int incrementBotWins(int botWins){
        return botWins++;
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
    public static String score(int userWins, int botWins){
        return "User: " + userWins + " Bot: " + botWins;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char difficulty = ' ';
        int attempts = 0;
        String user= " ";

        do{
            System.out.println("Select Game Difficulty:   ");
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