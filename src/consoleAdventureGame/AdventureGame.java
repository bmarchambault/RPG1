package consoleAdventureGame;

import util.Input;

public abstract class AdventureGame {
    Input userInput = new Input();
    protected String herosName;
    protected int herosHealth = 100;
    protected int enemysHealth = 75;
    protected int attack = 5;
   protected int defend = 3;
    protected int potion = 15;
    protected int remainingHeath;
   protected boolean endGame = false;

    public abstract void attack();
//    public void defend(){};
    public abstract void drinkPotion();
    public abstract void run();
    public abstract void remainingHealth ();
    public abstract void attacked();
}
