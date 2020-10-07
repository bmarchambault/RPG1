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

    //    public abstract void attack();
    public void defend(){};

    public abstract void remainingHealth ();
    public abstract void attacked();
//    public abstract String getHerosName();

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
