import java.util.Scanner;

public class Palindromi {
    

    public static boolean palindrome(String text) {
        String inReverse = reverse(text);
        return text.equals(inReverse);
    }
    
    public static String reverse(String text){
        String reverse = "";
        int i = text.length()-1;
        while(i>=0){
            char c = text.charAt(i);
            reverse += c;
            i--;        
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
