import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Grade grade = new Grade();
        
        System.out.println("Type exam scores, -1 completes:");
        int score = 0;
        
        while(score != -1){            
            score = reader.nextInt();
            if(score != -1 && score >= 0 && score <= 60){
                grade.addPoint(score);
            }           
        }        
        
        grade.getGrades();        
        grade.printGrades();        
        System.out.println("Acceptance percentage: " + grade.acceptance() + "%");
        
    }
}
