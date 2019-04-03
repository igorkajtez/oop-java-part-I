
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        String name;
        String studentNumber;

        System.out.print("name: ");
        name = reader.nextLine();
        
        while (!name.isEmpty()) {
            System.out.print("student number: ");
            studentNumber = reader.nextLine();            
            students.add(new Student(name, studentNumber));
            System.out.print("name: ");
            name = reader.nextLine();
        }

        for (Student student : students) {
            System.out.println(student);
        }        
        System.out.println("");
        
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        for(Student student : students){
            search(searchTerm, student);            
        }
    }
    
    public static void search(String searchTerm, Student student){
        if(student.getName().contains(searchTerm)){
            System.out.println(student);
        }
    }
}
