//package consoleAdventureGame;
//
//public interface IAdventureGame {
//     int randomNumber;
//    public void attack(int hp){
//        health -= hp;
//    }
//
//    //    public void defend(){};
//    public void defend(){
//        System.out.println(getPlayer() + " defended your attack." +getPlayer() + " inflicted 2 damage points");
//        health -= 2;
//        remainingHealth();
//    }
//    public void run() {
//        System.out.println("Game over, you lose");
//        System.out.println("Better luck next time");
//        endGame = true;
//    }
//    public void drinkPotion() {
//        System.out.println("You increased your health by 15 points");
//        health += 15;
//        remainingHealth();
//    }
//
//    public abstract void remainingHealth ();
//    public void attacked() {
//        remainingHealth();
//        randomNumber = getRandomNumber(10, 1);
//        System.out.println("RANDOM NUMBER IS " + randomNumber);
//        if(randomNumber == 3){
//            defend();
//        } else if (randomNumber == 4){
//            defend();
//            attack(5);
//        } else if(randomNumber == 6){
//            defend();
//            System.out.println("Enemy Retaliation! Critical Hit! 10 damage");
//            attack(10);
//        }
//    }
////    public void attackHero(int point){
////
////        System.out.println(health + "CURRENT HERO HEALTH");
////        health = health - point;
//////        System.out.println("your health is now " + herosHealth);
////    }
//
////    public abstract String getHerosName();
//
//    public int getRandomNumber(int min, int max) {
//        return (int) ((Math.random() * (max - min)) + min);
//    }
//
//
//
//}
