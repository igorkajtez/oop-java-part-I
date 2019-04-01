
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        letter = letter.toUpperCase();
        // if the letter has already been guessed, nothing happens
        if(!guessedLetters.contains(letter)){
            // if the word does not contains the guessed letter, number of faults increase
            if(!word.contains(letter)){
              numberOfFaults++;              
            }   
            // the letter is added among the already guessed letters
            guessedLetters+=letter;  
        }
    }

    public String hiddenWord() {
        String hiddenWord = "";
        int i = 0;
        // create the hidden word by interating through this.word letter by letter
        while(i < word.length()){
            char c = word.charAt(i);
            if(guessedLetters.contains("" + c)){
                // if the letter in turn is within the guessed words, put it in to the hidden word
                hiddenWord+=c;
            }else {
                // if the letter is not among guessed, replace it with _ in the hidden word 
                hiddenWord+="_";
            }
            i++;
        }        
        return hiddenWord;
    }
}
