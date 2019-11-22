package ua.epam.hw3;

import java.util.Scanner;

public class GameView {
    private Scanner in = new Scanner(System.in);
    private static final String ERROR_TEXT = "error";
    private static final String PLAYER_CHOICE_TEXT = "Make your choice between rock, paper, scissors: ";
    private static final String GAME_NAME_TEXT = "Rock-paper-scissors";

    public void start() {
        System.out.println(GAME_NAME_TEXT);
        System.out.println(PLAYER_CHOICE_TEXT);
        GameLogic gameLogic = new GameLogic();
        gameLogic.start(new GameWeapon(), inputData());
    }

    private String inputData() {
        String weaponPlayer = in.nextLine().toLowerCase();
        if (!weaponPlayer.equals("rock") && !weaponPlayer.equals("paper") && !weaponPlayer.equals("scissors")) {
            System.out.println(ERROR_TEXT);
            inputData();
        }
        return weaponPlayer;
    }
}
