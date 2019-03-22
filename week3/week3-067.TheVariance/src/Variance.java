import java.util.ArrayList;

public class Variance {
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int i : list){
            sum+=i;
        }
        return sum;
    }
    
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list)*sum(list);//Not the standard average
        int numbers = list.size();
        double average = (double)sum / numbers;
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        int sum = sum(list);
        double avg = average(list);
        
        int secondSum = 0;
        for(int i : list){
            secondSum+=Math.pow(i, 2);
        }
        
        double variance = (secondSum - avg)/(list.size()-1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
