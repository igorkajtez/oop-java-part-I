
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int a = reader.nextInt();
        System.out.print("Type another number: ");
        int b = reader.nextInt();
        
        double division = 1.0 * a / b;
        System.out.println("Division: " + a + " / " + b + " = " + division);

    }
}
