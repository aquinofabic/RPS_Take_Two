package TestPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTests {


    private String getResult(String rock) {
        return null;
    }

    @Test
    public void testValidInputRock() {
        RpsGame game = new RpsGame();
        String result = game.play("rock");
        assertEquals("Valid input", result);

    }
}