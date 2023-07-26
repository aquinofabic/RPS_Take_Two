package MainPackage;
import java.util.Random;
public class Computer extends Player{
    private int compChoice;
    public int getComputerChoice() {
        Random random = new Random();
        int compChoice = random.nextInt(3) + 1;
        return compChoice;
    }
    public void setCompChoice(int newCompChoice){
        this.compChoice = newCompChoice;
    }
}
