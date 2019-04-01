import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        int i = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        while(i < length){
            char symbol = alphabet.charAt(random.nextInt(alphabet.length()));
            password+=symbol;
            i++;
        }
        return password;
    }
}
