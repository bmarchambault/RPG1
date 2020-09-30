package consoleAdventureGame;

import util.Input;

public abstract class AdventureGame {

    Input userInput = new Input();
    protected String herosName;
    protected int herosHealth;
    protected int enemysHealth;
    protected int attack = 5;
    protected int defend = 3;
    protected int potion = 15;
    protected int remainingHeath;
    protected boolean endGame = false;

//    public abstract void attack();
//    public void defend(){};

    public abstract void remainingHealth ();
    public abstract void attacked();
    public abstract String getHerosName();
}
