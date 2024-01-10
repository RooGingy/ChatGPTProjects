import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args)
    {
        final int D4 = 4;
        final int D6 = 6;
        final int D8 = 8;
        final int D10 = 10;
        final int D12 = 12;
        final int D20 = 20;
        final int MAX_NUMBER_OF_DICE = 6;

        Scanner input = new Scanner(System.in);
        String diceDimentions;
        int numberOfDice;
        int faceNumbers;


        do{
            System.out.println("D4 = 4 Faces");
            System.out.println("D6 = 6 Faces");
            System.out.println("D8 = 8 Faces");
            System.out.println("D10 = 10 Faces");
            System.out.println("D12 = 12 Faces");
            System.out.println("D20 = 20 Faces");
            System.out.println();

            System.out.print("How many dimentions do you want on each dice: ");
            diceDimentions = input.next();
            diceDimentions = diceDimentions.substring(1,diceDimentions.length);



        } while(D4 == faceNumbers || D6 == faceNumbers ||
                D8 == faceNumbers || D10 != faceNumbers ||
                D12 == faceNumbers || D20 == faceNumbers);
        do{
            System.out.print("Enter number of dice you want to roll: ");
            numberOfDice = input.nextInt();
        } while(numberOfDice > 0 && numberOfDice < MAX_NUMBER_OF_DICE);
    }
}