package ua.epam.hw3Test;

import org.junit.Test;
import ua.epam.hw3.GameLogic;
import ua.epam.hw3.GameWeapon;

import static org.junit.Assert.assertEquals;

public class GameLogicTest {
    GameLogic gameLogic = new GameLogic();


    String input = "paper";
    GameWeapon gameWeapon = gameLogic.start(new GameWeapon(), input);
    @Test
    public void testGameLogic1() {
        assertEquals(input,gameWeapon.getWeaponAI());
    }
}
