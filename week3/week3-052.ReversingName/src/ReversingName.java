import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name:");
        String name = reader.nextLine();
        
        String reverseName = "";
        int i = name.length()-1;
        while(i>=0){
            char nameChar = name.charAt(i);            
            reverseName += nameChar;
            i--;
        }
        System.out.println("In reverse order: " + reverseName);
    }
}
