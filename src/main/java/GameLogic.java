import java.util.Random;
import java.util.Scanner;

class GameLogic {
    private static final String WIN_TEXT = "You win!";
    private static final String LOSE_TEXT = "You lose!";
    private static final String TIE_TEXT = "Tie!";
    private static final String ERROR_TEXT = "error";
    private static final String AI_CHOICE_TEXT = "AI choice: ";
    private static final String PLAYER_CHOICE_TEXT = "Make your choice between rock, paper, scissors: ";
    private static final String GAME_NAME_TEXT = "Rock-paper-scissors";

    private Scanner in = new Scanner(System.in);
    private String weaponPlayer = "";
    private String weaponAI = "";
    private String paper = "paper";
    private String rock = "rock";
    private String scissors = "scissors";

    private void greeting() {
        System.out.println(GAME_NAME_TEXT);
        System.out.println(PLAYER_CHOICE_TEXT);
    }
    private void inputData() {
        weaponPlayer = in.nextLine().toLowerCase();
        if (!weaponPlayer.equals(rock) && !weaponPlayer.equals(paper) && !weaponPlayer.equals(scissors)) {
            System.out.println(ERROR_TEXT);
            inputData();
        }
    }
    private void choiceAI() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(3);
        switch (randomNumber) {
            case 0:
                weaponAI = rock;
                System.out.println(AI_CHOICE_TEXT + weaponAI);
                break;
            case 1:
                weaponAI = paper;
                System.out.println(AI_CHOICE_TEXT + weaponAI);
                break;
            case 2:
                weaponAI = scissors;
                System.out.println(AI_CHOICE_TEXT + weaponAI);
                break;
        }
    }
    private void win() {
        if (weaponPlayer.equals(weaponAI)){
            System.out.println(TIE_TEXT);
        } else if (weaponPlayer.equals(paper)) {
            if (weaponAI.equals(scissors)) {
                System.out.println(LOSE_TEXT);
            } else if(weaponAI.equals(rock)) {
                System.out.println(WIN_TEXT);
            }
        } else if (weaponPlayer.equals(scissors)) {
            if (weaponAI.equals(rock)) {
                System.out.println(LOSE_TEXT);
            } else if(weaponAI.equals(paper)) {
                System.out.println(WIN_TEXT);
            }
        } else if (weaponPlayer.equals(rock)) {
            if (weaponAI.equals(paper)) {
                System.out.println(LOSE_TEXT);
            } else if(weaponAI.equals(scissors)) {
                System.out.println(WIN_TEXT);
            }
        }
    }
    void start() {
        greeting();
        inputData();
        choiceAI();
        win();
    }
}