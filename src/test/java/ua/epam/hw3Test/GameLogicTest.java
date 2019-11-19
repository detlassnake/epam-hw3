package ua.epam.hw3Test;

import org.junit.Test;
import ua.epam.hw3.GameLogic;

import static org.junit.Assert.assertEquals;

public class GameLogicTest {
    GameLogic g = new GameLogic();

    String input = g.setWeaponPlayer("Paper");
    String result = g.getWeaponPlayer();
    @Test
    public void testGameLogic1() {
        assertEquals(input,result);
    }
}
