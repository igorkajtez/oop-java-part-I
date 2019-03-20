
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int number = reader.nextInt();
        
        int sum = 0;
        int i = 1;
        
        while(i <= number){
            sum+=i;
            i++;
        }
        System.out.println(sum);

    }
}
