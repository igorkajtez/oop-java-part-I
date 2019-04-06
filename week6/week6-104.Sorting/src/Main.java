
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int startIndex) {
        int index = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {        
            int placeholder = array[index1];
            array[index1] = array[index2];
            array[index2] = placeholder;        
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int smallest = indexOfTheSmallestStartingFrom(array, i);
            System.out.println(Arrays.toString(array));
            swap(array, i, smallest);
        }
    }

}
