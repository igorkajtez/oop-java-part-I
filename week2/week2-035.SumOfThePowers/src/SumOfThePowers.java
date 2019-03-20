
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = reader.nextInt();
        int i = 0;
        int result = 0;
        while(i <= number){
            int power = (int)Math.pow(2, i);
            result+=power;
            i++;
        }
        
        System.out.println("The result is: " + result);

    }
}
