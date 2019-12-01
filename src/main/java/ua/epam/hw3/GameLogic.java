package ua.epam.hw3;

import java.util.Random;


public class GameLogic {
    private static final String WIN_TEXT = "You win!";
    private static final String LOSE_TEXT = "You lose!";
    private static final String TIE_TEXT = "Tie!";
    private static final String AI_CHOICE_TEXT = "AI choice: ";

    private void choiceAI(GameWeapon gameWeapon) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

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
            default:
                break;
        }
    }

    private void checkWinner(GameWeapon gameWeapon) {
        String weaponPlayer = gameWeapon.getWeaponPlayer();
        String weaponAI = gameWeapon.getWeaponAI();

        if (weaponPlayer.equals(weaponAI)) {
            System.out.println(TIE_TEXT);
        } else if (weaponPlayer.equals("paper")) {
            if (weaponAI.equals("scissors")) {
                System.out.println(LOSE_TEXT);
            } else if (weaponAI.equals("rock")) {
                System.out.println(WIN_TEXT);
            }
        } else if (weaponPlayer.equals("scissors")) {
            if (weaponAI.equals("rock")) {
                System.out.println(LOSE_TEXT);
            } else if (weaponAI.equals("paper")) {
                System.out.println(WIN_TEXT);
            }
        } else if (weaponPlayer.equals("rock")) {
            if (weaponAI.equals("paper")) {
                System.out.println(LOSE_TEXT);
            } else if (weaponAI.equals("scissors")) {
                System.out.println(WIN_TEXT);
            }
        }
    }

    public GameWeapon run(GameWeapon gameWeapon, String inputWeapon) {
        gameWeapon.setWeaponPlayer(inputWeapon);
        choiceAI(gameWeapon);
        checkWinner(gameWeapon);
        return gameWeapon;
    }
}