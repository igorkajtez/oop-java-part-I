
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = reader.nextInt();
        
        if(number>0){
            System.out.println("The number " + number + " is positive");
        }else {
            System.out.println("The number " + number + " is not positive");
        }

    }
}
