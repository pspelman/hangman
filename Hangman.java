package treehouse.hangman;
import java.util.Scanner;


public class Hangman {

    public static void main(String[] args) {
        System.out.print("This is the hangman game");
        Game game = new Game("treehouse"); //this created the game with the answer "treehouse"
        Prompter prompter = new Prompter(game); //this created the prompter, so the user can make guesses
        boolean isHit = prompter.promptForGuess();
        if (isHit) {
            System.out.println("We've got a hit!");
        } else {
            System.out.println("Ooops, miss!");
        }
    }
}
