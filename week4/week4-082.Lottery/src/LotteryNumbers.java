import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private int number;
    private Random random;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        while(i < 7){
            number = random.nextInt(39)+1;
            if(!containsNumber(number)){
                numbers.add(number);
                i++;
            }
        }
        
    }

    public boolean containsNumber(int number) {        
        return numbers.contains(number);
    }
}
