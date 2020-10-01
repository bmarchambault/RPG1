package consoleAdventureGame;

public class Enemy extends AdventureGame {
    public Enemy() {}


    @Override
    public void attacked() {
        System.out.println(getHerosName() + " decreased the enemy's health by 5 points");
        enemysHealth = enemysHealth - attack;
        System.out.println(enemysHealth);
        randomNumber = getRandomNumber(10, 1);
        System.out.println(randomNumber);
        if(randomNumber == 3){
            defend();
        } else if (randomNumber == 4){
            attackHero();
        } else if(randomNumber == 6){
            System.out.println("Critical Hit! Enemy dealt 10 damage");
            herosHealth -= 10;
        }
    }

    public void attackHero(){
        herosHealth -= 5;
    }

    public void showInfo() {
        System.out.println("Enemy Health = " + enemysHealth);
    }

    @Override
    public void remainingHealth() {
        System.out.println("Enemy's health is now " + enemysHealth + ".");
    }

    @Override
    public String getHerosName() { return herosName; }


public void defend(){
    System.out.println("Enemy defended your attack.  You've inflicted 2 damage points");
    enemysHealth -= 2;
    remainingHealth();
}
//    public int getRandomNumber(int min, int max) {
//        return (int) ((Math.random() * (max - min)) + min);
//    }
}