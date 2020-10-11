package consoleAdventureGame;

public class Enemy extends AdventureGamePlayer {


    public Enemy() {}
    public Enemy(String enemyType, int health){
        super(enemyType, health);
    }

//    @Override
//    public void attacked() {
////        enemyHealth = enemyHealth - attack;
//       remainingHealth();
//        randomNumber = getRandomNumber(10, 1);
//        System.out.println("RANDOM NUMBER IS " + randomNumber);
//        if(randomNumber == 3){
//            defend();
//        } else if (randomNumber == 4){
//            defend();
//            attackHero(5);
//        } else if(randomNumber == 6){
//            defend();
//            System.out.println("Enemy Retaliation! Critical Hit! 10 damage");
//           attackHero(10);
//        }
//    }

//    public void attackHero(int point){
//
////        System.out.println(herosHealth + "CURRENT HERO HEALTH");
////        herosHealth = herosHealth - point;
////        System.out.println("your health is now " + herosHealth);
//    }


    public void showInfo() {
      System.out.println(
                "Enemy:  Lvl1 Thief"  + '\n' +
                "Enemy's Health = " + getHealth());
    }

    @Override
    public void remainingHealth() {
//        System.out.println("Enemy's health is now " + enemysHealth + ".");
    }



//    public int getRandomNumber(int min, int max) {
//        return (int) ((Math.random() * (max - min)) + min);
//    }
}