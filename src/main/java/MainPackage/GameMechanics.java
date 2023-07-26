package MainPackage;

import java.util.Scanner;

public class GameMechanics {
    private Player player;
    private Computer computer;

    public GameMechanics(Player player, Computer computer){
        this.player = player;
        this.computer = computer;
    }
    public void play() {

        System.out.println("Lets play rock, paper, scissors!");

        while (true) {
            System.out.println("Enter your choice: rock, paper, scissors, or exit");

            String[] choices = new String[]{"rock", "paper", "scissors"};
            String playerChoice = player.getPlayerChoice();
            int compChoice = computer.getComputerChoice();

            // EXIT
            if (playerChoice.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            // TIE
            else if (playerChoice.equals(choices[compChoice -1 ])) {
                System.out.println("It's a tie!");
                System.out.println("computer chose " + choices[compChoice -1 ]);
            }
            // WIN
            else if ((playerChoice.equals(choices[compChoice - 2 ]))) {
                System.out.println("You win!");
                System.out.println("computer chose " + choices[compChoice]);
            }
            // LOSE
            else {
                System.out.println("Loser");
                System.out.println("computer chose " + choices[compChoice]);
            }
        }
    }
}