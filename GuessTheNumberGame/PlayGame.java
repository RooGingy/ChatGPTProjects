
/**
 * Gussing game where bot chooses a random number
 * and you are to guess the generated number.
 *
 * @author RooGingy
 * @version 12/06/2023
 * 
 */

import java.util.*;
import java.lang.*;

public class PlayGame
{
    static private int range = 10;
    static private int attempts = 0;
    static private int level = 0;

    /**
     * Level Up:
     * <p>
     * After user guess the correct number everything increases.
     * 
     * @param userWins gets the amount of user wins.
     * @param botWins gets the amount of bot wins.
     * @return diplays the score.
     */
    public static void levelUp(){
        //Increments what level the user is on;
        level++;
        // After level 1 the range will increase.
        if(level > 1){
            range *= 2;
        }
        // Gets the number of attempts per level.
        attempts = tries(range);
    }
    
    /**
     * Rest Game:
     * <p>
     * Resets game once player loses.
     */
    public static void resetGame(){
        range = 10;
        attempts = 0;
        level = 0;
    }
    
    /**
     * Number of Attempts:
     * <p>
     * Calculate nunber of attemps baes off the range the bot generates.
     * 
     * @param range takes the range and divides it by 2 to get the number of
     * attemps a person has each round.
     * @return gets number of attemps per round.
     */
    public static int tries(int range){
        int tries = 0;
        while(range > 1){
            range /= 2;
            tries++;
        }
        return tries;
    }

    public static void playGame(){
        Scanner input = new Scanner(System.in);
        int userInt = 0 ;
        int bot = 0;

        do{
            levelUp();
            bot = (int)(Math.random() * (range - 1)) + 1;
            System.out.println("Level: " + level);
            System.out.println("You have " + attempts + " attempts");
            System.out.print("Ener a number between 1 through " + range+ ": ");
            userInt = input.nextInt();
            System.out.println();

            while(userInt != bot && attempts  > 0){
                if(userInt < 1 || userInt > range){
                    System.out.println("Number outside range!");
                    System.out.print("Ener a number between 1 through " + range+ ": ");
                    userInt = input.nextInt();
                    System.out.println();

                }
                else if(userInt < bot){
                    attempts--;
                    System.out.println("Number is too low!");
                    System.out.println("You have " + attempts + " attempts");
                    System.out.print("Try again: ");
                    userInt = input.nextInt();
                    System.out.println();

                }
                else if(userInt > bot){
                    attempts--;
                    System.out.println("Number is too high!");
                    System.out.println("You have " + attempts + " attempts");
                    System.out.print("Try again: ");
                    userInt = input.nextInt();
                    System.out.println();

                }
            }

            if(userInt == bot){
                System.out.println("Correct!");
                System.out.println();
                System.out.println("You have now advanced to the next level!");
                playGame();
            }
            else{
                System.out.println("Game over!");
                break;
            }
        } while(attempts > 1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userString = " ";
        int userInt = 0 ;
        boolean started = false;
        boolean stopGame = false;
        int bot = 0;
        do{
            if (started == false){
                // Ask user to enter start.
                System.out.print("Type START to play game: ");
                userString = input.next().toUpperCase();
                System.out.println();

                // If it started then game will begin.
                if(userString.equals("START")){
                    playGame();
                    started = true;
                }
            }
            if(started == true){
                do{
                    System.out.println("Do you want to play again?");
                    System.out.println("Enter Y for: Yes");
                    System.out.println("Enter N for: No ");
                    userString = input.nextLine();
                    System.out.println();

                    if(userString.toUpperCase().equals("Y")){
                        resetGame();
                        playGame();
                    }
                    else{
                        break;
                    }

                } while(!(userString.toUpperCase().equals("Y") || userString.toUpperCase().equals("N")));
                if(userString.equals("N")){
                    break;
                }
            }
        } while(!(userString.equals("START")));

        System.out.println("Game has stopped running.");
    }
}