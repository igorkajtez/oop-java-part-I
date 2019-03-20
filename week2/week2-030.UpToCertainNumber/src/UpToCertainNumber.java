
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Up to what number? ");
        int number = reader.nextInt();
        
        int counter = 1;
        while(counter <= number){
            System.out.println(counter);
            counter++;
        }
        
    }
}
