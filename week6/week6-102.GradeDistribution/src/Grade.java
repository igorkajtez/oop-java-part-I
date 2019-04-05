
import java.util.ArrayList;

public class Grade {
    private int accepted;
    private ArrayList<Integer> points;
    private int[] grades;
    private final int NUM_OF_GRADES = 6;

    public Grade() {
        this.points = new ArrayList<Integer>();
        this.grades = new int[NUM_OF_GRADES];
    }

    public void addPoint(int point) {
        this.points.add(point);
    }

    public void getGrades() {
        for (int point : points) {
            if (point < 30) {
                grades[0]++;
            } else if (point < 35) {
                grades[1]++;
                accepted++;
            } else if (point < 40) {
                grades[2]++;
                accepted++;
            } else if (point < 45) {
                grades[3]++;
                accepted++;
            } else if (point < 50) {
                grades[4]++;
                accepted++;
            } else if (point <= 60) {
                grades[5]++;
                accepted++;
            }
        }
    }
    
    public static void printStars(int stars){
        for (int i = 0; i < stars; i++) {
            System.out.print("*");            
        }
    }

    public void printGrades() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(grades[i]);
            System.out.println("");            
        }
    }
    
    public double acceptance(){
        if(points.isEmpty()){
          return 0;
        }
        return 100 * accepted / points.size();  
    }

}
