package TestPackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTests {
    @Test
    public void testCreateNewGame(){
        Game game = new RpsGame();
        Assertions.assertNotNull(game);
    }

    @Test
    public void testPlayGame(){
        Game game = new RpsGame();
        game.play();
    }

    @Test
    public void testResultNotNull
        Game game = new RpsGame();
    @Test
    public void testGetGameResult(){
        Game game = new RpsGame();
        game.play();
        Result result = game.getResult();
        Assertions.assertNotNull(result);
    }



    @Test
    public void testCompMove(){

    }
}
