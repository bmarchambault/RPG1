package consoleAdventureGame;

public class Enemy extends AdventureGame {


    public Enemy() {};


    @Override
    public  void attacked() {
        System.out.println("" + herosName + " decreased enemy's health by 5 points");
        enemysHealth = enemysHealth - attack;
        System.out.println(enemysHealth);
    };

    @Override
    public void attack() {

    }


    public void showInfo() {
        System.out.println("Enemy Health = " + enemysHealth);
    }

    @Override
    public void drinkPotion() {

    }

    @Override
    public void run() {

    }

    @Override
    public void remainingHealth() {
        System.out.println("Enemy's healh is now " + enemysHealth + ".");
    }

}
