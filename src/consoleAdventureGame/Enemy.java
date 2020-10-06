package consoleAdventureGame;

public class Enemy extends AdventureGame {
    public Enemy() {}


    @Override
    public void attacked() {
        enemysHealth = enemysHealth - attack;
       remainingHealth();
        randomNumber = getRandomNumber(10, 1);
        System.out.println(randomNumber);
        if(randomNumber == 3){
            defend();
        } else if (randomNumber == 4){
            defend();
            attackHero();
        } else if(randomNumber == 6){
            defend();
            System.out.println("Critical Hit! Enemy retaliated and dealt 10 damage");
            herosHealth -= 10;
        }
    }

    public void attackHero(){
        herosHealth -= 5;
        System.out.println("The enemy retaliated, your health is now " + herosHealth);
    }


    public void showInfo() {
        System.out.println("Enemy Health = " + enemysHealth);
    }

    @Override
    public void remainingHealth() {
        System.out.println("Enemy's health is now " + enemysHealth + ".");
    }


public void defend(){
    System.out.println("Enemy defended your attack.  You only inflicted 2 damage points");
    enemysHealth -= 2;
    remainingHealth();
}
//    public int getRandomNumber(int min, int max) {
//        return (int) ((Math.random() * (max - min)) + min);
//    }
}