
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int counter = 0;

        // program your solution here. Do not touch the above lines!
        while(true){
            System.out.print("Guess a number: ");
            int guess = reader.nextInt();
            counter++;
            if(guess < numberDrawn){
                System.out.println("The number is greater, guesses made: " + counter);
            }else if(guess > numberDrawn){
                System.out.println("The number is lesser, guesses made: " + counter);
            }else{
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
