
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {        
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int years = reader.nextInt();
        
        if(years>=0 && years <= 120){
            System.out.println("OK");
        }else {
            System.out.println("Impossible!");
        }

    }
}
