package ua.epam.hw3;


public class GameWeapon {
    private String weaponPlayer = "";
    private String weaponAI = "";

    public void setWeaponAI(String weaponAI) {
        this.weaponAI = weaponAI;
    }

    public void setWeaponPlayer(String weaponPlayer) {
        this.weaponPlayer = weaponPlayer;
    }

    public String getWeaponAI() {
        return weaponAI;
    }

    public String getWeaponPlayer() {
        return weaponPlayer;
    }
}
