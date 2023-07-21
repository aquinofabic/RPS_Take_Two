package TestPackage;

public class RpsGame implements Game {
    @Override
    public void play() {
        System.out.println("Lets play the game");
    }

    @Override
    public Result getResult() {
        return new StringResult();
    }
}
