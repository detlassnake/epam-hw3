import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GameLogicTest {
    GameLogic g = new GameLogic();

    String input = g.setWeaponPlayer("Paper");
    String result = g.getWeaponPlayer();
    @Test
    public void testGameLogic() {
        assertEquals(input,result);
    }
}
