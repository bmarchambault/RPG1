package consoleAdventureGame;
import java.lang.String;
import util.Input;

public class ConsoleAdventureGameApp {
    public static void main(String[] args) {
//enemy name generator
//critical hits

        Input userInput = new Input();
        boolean confirmPlay;
        String nextMove;
        boolean endGame = false;

        //ask if the user is ready to start
        //ask user for their name
        //hero - display enemy stats and hero stats: example - health, attack,
        //hero actions:  attack - decreases enemy health, drink potion - add to hero health, run - ends the game;
        //keep asking for user input until enemy health is

        confirmPlay = userInput.yesNo("Would you like to play a role player game? ");
//        System.out.println(playGame);

        if (confirmPlay) {
            Hero hero = new Hero();
            hero.showInfo();
            Enemy enemy = new Enemy();
            enemy.showInfo();
            do {
                nextMove = userInput.getString("What would you like to do next?  a = attack, d = drink potion, r = run");
                System.out.println(nextMove);
                if (nextMove.equalsIgnoreCase("a")) {
//                    hero.attack();
                    enemy.attacked();

                } else if (nextMove.equalsIgnoreCase("d")) {
                    hero.drinkPotion();
                    hero.remainingHealth();

                } else if (nextMove.equalsIgnoreCase("r")) {
                    hero.run();
                } else if (enemy.enemysHealth <=0 || hero.herosHealth <= 0) {
                    if(enemy.enemysHealth <= 0){
                        System.out.println("You defeated the enemy");
                        endGame = true;
                    } else{
                        System.out.println("You lost!");
                        endGame = true;
                    }
                    System.out.println("Maybe next time");
                    endGame = true;
                }


            } while (!endGame);
        }

    }
}

