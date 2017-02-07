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
        System.out.println("How many sides should each die have?");
        int numberSide = scan.nextInt();
        rollDice(numberSide);

        System.out.println("Thanks for playing!");
    }
    public static void rollDice(int sides){
        Scanner scan = new Scanner(System.in);
        String repeatRoll = "y";
        int count = 1;

        while (repeatRoll.equalsIgnoreCase("y")) {
            System.out.println("Roll " + count);
            int die1 = (int) (Math.random() * sides + 1);
            int die2 = (int) (Math.random() * sides + 1);
            System.out.println(die1);
            System.out.println(die2);
            int rollerName = die1 + die2;
            if(rollerName == 2){
                System.out.println("Snake Eyes");
            } else if(rollerName == 7 || rollerName == 11){
                System.out.println("Craps");
            } else if(rollerName == 12){
                System.out.println("Box Car");
            }
            System.out.println("Roll again? (y/n): ");
            repeatRoll = scan.next();
            count++;
        }
    }
}
