package consoleAdventureGame;

import util.Input;

public abstract class AdventureGamePlayer {

    Input userInput = new Input();

    protected int health;
    protected String player;
    protected boolean endGame = false;
    protected int randomNumber;

    public AdventureGamePlayer(){};
    public AdventureGamePlayer(  int health) {
        this.player = player;
        this.health = health;
    }

    public AdventureGamePlayer( String player, int health) {
        this.player = player;
        this.health = health;
    }

    public void attack(int hp){
        health -= hp;
    }

    public void defend(){};

    public abstract void remainingHealth ();
    public void attacked() {
        remainingHealth();
        randomNumber = getRandomNumber(10, 1);
        System.out.println("RANDOM NUMBER IS " + randomNumber);
        if(randomNumber == 3){
            defend();
        } else if (randomNumber == 4){
            defend();
            attack(5);
        } else if(randomNumber == 6){
            defend();
            System.out.println("Enemy Retaliation! Critical Hit! 10 damage");
            attack(10);
        }
    }
//    public void attackHero(int point){
//
//        System.out.println(health + "CURRENT HERO HEALTH");
//        health = health - point;
////        System.out.println("your health is now " + herosHealth);
//    }

//    public abstract String getHerosName();

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

}
