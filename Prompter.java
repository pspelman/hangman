package treehouse.hangman;
import java.util.Scanner;

//This class is responsible for getting input
public class Prompter {
    private Game game;

    //Make a CONSTRUCTOR to create the game
    public Prompter(Game game){
        this.game = game;
    }

    //Now we need a method to PROMPT for the guess!
    public boolean promptForGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter:  "); //this will display a line to the user to input something
        String guessInput = scanner.nextLine(); //This will set "guess" equal to whatever the line is that was just entered
        //we can only send ONE char to the applyGuess() ability we created, so I need to pull one char

        char guess = guessInput.charAt(0);
        System.out.println("This is a new line!");
        //the PROMPTER doesn't test if the guess matches, that's done by the GAME logic
        return game.applyGuess(guess);




    }

}
