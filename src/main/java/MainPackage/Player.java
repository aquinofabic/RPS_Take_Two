package MainPackage;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String playerChoice;
    public String getPlayerChoice() {
        Scanner scanner = new Scanner(System.in);
        String playerChoice = scanner.next();
        return playerChoice;
    }
    public void setPlayerChoice(String newPlayerChoice) {
        this.playerChoice = newPlayerChoice;
    }
}
