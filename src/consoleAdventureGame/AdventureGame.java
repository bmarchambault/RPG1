package consoleAdventureGame;

import util.Input;

public abstract class AdventureGame {

    Input userInput = new Input();

    protected int herosHealth = 100;
    protected int enemysHealth = 100;
    protected int attack = 5;
    protected int defend = 3;
    protected int potion = 15;
    protected int remainingHeath;
    protected boolean endGame = false;
    protected int randomNumber;

//    public abstract void attack();
    public void defend(){};

    public abstract void remainingHealth ();
    public abstract void attacked();
//    public abstract String getHerosName();

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
