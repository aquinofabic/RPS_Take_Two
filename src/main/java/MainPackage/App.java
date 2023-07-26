package MainPackage;

public class App {
    public static void main(String[] args) {

        // Instantiate new objects to play
        Player player = new Player();
        Computer computer = new Computer();
        Game game = new Game(player, computer);

        game.play();
    }
}
