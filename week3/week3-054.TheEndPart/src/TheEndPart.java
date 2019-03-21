import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int endPartLength = reader.nextInt();
        
        
        int startingPosition = word.length() - endPartLength;
        String endPart = word.substring(startingPosition, word.length());
        System.out.println("Result: " + endPart);
    }
}
