package bootcamp;

import java.util.Scanner;

/**
 * Created by DeMarcj on 2/3/2017.
 */
public class DiceGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grand Circus!");
        System.out.println("");
        System.out.println("How many sides should each die have? ");
        int numberSide = scan.nextInt();
        rollDice(numberSide);

        System.out.println("Thanks for playing!");
    }
    public static void rollDice(int sides){
        Scanner scan = new Scanner(System.in);
        String repeatRoll = "y";
        int count = 1;

        while (repeatRoll.equalsIgnoreCase("y")) {
            int dice = (int)(Math.random() * sides + 1);
            System.out.println("Roll " + count);
            System.out.println(dice);
            System.out.println("Roll again? (y/n): ");
            repeatRoll = scan.next();
            count++;
        }
    }
}
