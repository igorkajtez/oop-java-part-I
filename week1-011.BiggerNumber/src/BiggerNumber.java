
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int a = reader.nextInt();
        System.out.print("Type another number: ");
        int b = reader.nextInt();
        
        int bigger = Math.max(a, b);
        System.out.println("The bigger number of the two numbers given was: " + bigger);        

    }
}
