package ua.epam.hw3;

import java.util.Random;

public class GameLogic {
    private static final String WIN_TEXT = "You win!";
    private static final String LOSE_TEXT = "You lose!";
    private static final String TIE_TEXT = "Tie!";
    private static final String AI_CHOICE_TEXT = "AI choice: ";

    private void choiceAI(GameWeapon gameWeapon) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(3);
        switch (randomNumber) {
            case 0:
                gameWeapon.setWeaponAI("rock");
                System.out.println(AI_CHOICE_TEXT + gameWeapon.getWeaponAI());
                break;
            case 1:
                gameWeapon.setWeaponAI("paper");
                System.out.println(AI_CHOICE_TEXT + gameWeapon.getWeaponAI());
                break;
            case 2:
                gameWeapon.setWeaponAI("scissors");
                System.out.println(AI_CHOICE_TEXT + gameWeapon.getWeaponAI());
                break;
        }
    }
    private void checkWinner(GameWeapon gameWeapon) {
        if (gameWeapon.getWeaponPlayer().equals(gameWeapon.getWeaponAI())) {
            System.out.println(TIE_TEXT);
        } else if (gameWeapon.getWeaponPlayer().equals("paper")) {
            if (gameWeapon.getWeaponAI().equals("scissors")) {
                System.out.println(LOSE_TEXT);
            } else if (gameWeapon.getWeaponAI().equals("rock")) {
                System.out.println(WIN_TEXT);
            }
        } else if (gameWeapon.getWeaponPlayer().equals("scissors")) {
            if (gameWeapon.getWeaponAI().equals("rock")) {
                System.out.println(LOSE_TEXT);
            } else if (gameWeapon.getWeaponAI().equals("paper")) {
                System.out.println(WIN_TEXT);
            }
        } else if (gameWeapon.getWeaponPlayer().equals("rock")) {
            if (gameWeapon.getWeaponAI().equals("paper")) {
                System.out.println(LOSE_TEXT);
            } else if (gameWeapon.getWeaponAI().equals("scissors")) {
                System.out.println(WIN_TEXT);
            }
        }
    }

    public GameWeapon start(GameWeapon gameWeapon,String str) {
        gameWeapon.setWeaponPlayer(str);
        choiceAI(gameWeapon);
        checkWinner(gameWeapon);
        return gameWeapon;
    }
}