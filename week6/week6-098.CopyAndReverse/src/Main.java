
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copy
        copied[0] = 99;

        // printing both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));

        System.out.println("");

        int[] reversed = reverseCopy(original);

        // printing both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reversed));
        
    }

    public static int[] copy(int[] array) {
        int[] copied = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reversed = new int[array.length];

        int i = 0;
        for (int j = array.length - 1; j >= 0; j--) {
            reversed[j] = array[i];
            i++;
        }
        return reversed;
    }

}
