package consoleAdventureGame;
import java.lang.String;
import util.Input;

public class ConsoleAdventureGameApp {
    public static void main(String[] args) {

        Input userInput = new Input();
        boolean confirmPlay;
        String nextMove;

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
            nextMove = userInput.getString("What would you like to do next?  a = attack, d = drink potion, r = run");

            System.out.println(nextMove);
            if(nextMove.equalsIgnoreCase("a")){
                hero.attack();
               enemy.attacked();
            }
        } else {
            System.out.println("Maybe next time");
        }



    }
}

