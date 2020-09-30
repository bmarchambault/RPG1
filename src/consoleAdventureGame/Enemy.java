package consoleAdventureGame;

public class Enemy extends AdventureGame {
    public Enemy() {}

    @Override
    public void attacked() {
        System.out.println(getHerosName() + " decreased the enemy's health by 5 points");
        enemysHealth = enemysHealth - attack;
        System.out.println(enemysHealth);
    }

    public void showInfo() {
        System.out.println("Enemy Health = " + enemysHealth);
    }

    @Override
    public void remainingHealth() {
        System.out.println("Enemy's health is now " + enemysHealth + ".");
    }

    @Override
    public String getHerosName() { return null; }


}