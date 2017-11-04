package treehouse.hangman;

public class Game {
    private String answer;
    private String hits;
    private String misses;


    //This class will hold the LOGIC for the hangman game
    public Game(String answer) {
        //I should have the answer, it should be PRIVATE
        this.answer = answer;

        hits = "";
        misses = "";

    //I should keep track of hits and misses

    //I need to test if the letter guessed is in the answer

    }

    public boolean applyGuess(char letter) {

        boolean isHit = ((answer.indexOf(letter) != -1) ? true : false);
        System.out.print("the isHit returned " + isHit);

        if (answer.indexOf(letter) == -1) {
            misses += letter;
        } else {
            hits += letter;
        }
        return answer.indexOf(letter) != -1;
    }

}
