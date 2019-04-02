
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String firstUser = reader.next();
        System.out.print("Type your age: ");
        int firstUsersAge = reader.nextInt();
        System.out.println("");
        
        System.out.print("Type your name: ");
        String secondUser = reader.next();
        System.out.print("Type you age: ");
        int secondUsersAge = reader.nextInt();        

        int ageSum = firstUsersAge + secondUsersAge;
        System.out.println(firstUser + " and " + secondUser + " are " + ageSum + " years old in total.");        

    }
}
