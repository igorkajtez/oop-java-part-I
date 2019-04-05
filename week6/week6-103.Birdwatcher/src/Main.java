
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Observation observation = new Observation();

        String command = "";

        while (!command.equals("Quit")) {
            System.out.print("? ");
            command = reader.nextLine();

            if (command.equals("Add")) {
                 add(reader, observation);
            }
            if (command.equals("Observation")) {
                observation(reader, observation);
            }
            if (command.equals("Statistics")) {
                statistics(reader, observation);
            }
            if (command.equals("Show")) {
                show(reader, observation);
            }
        }
    }

    public static void add(Scanner reader, Observation observation) {
        System.out.print("Name: ");
        String name = reader.nextLine();

        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();

        observation.addBird(name, latinName);
    }

    public static void observation(Scanner reader, Observation observation) {
        System.out.print("What was observed: ");
        String name = reader.nextLine();

        observation.addObservation(name);
    }

    public static void statistics(Scanner reader, Observation observation) {
        observation.printStatistics();
    }

    public static void show(Scanner reader, Observation observation) {
        System.out.print("What: ");
        String name = reader.nextLine();

        observation.printBird(name);
    }

}
