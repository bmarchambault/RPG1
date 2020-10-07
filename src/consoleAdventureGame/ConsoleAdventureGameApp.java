package consoleAdventureGame;
import java.lang.String;
import util.Input;

public class ConsoleAdventureGameApp {
    public static void main(String[] args) {
//enemy name generator
// end game doesn't work for 0 health or run.
//enemy isn't dealing damage

        Input userInput = new Input();
        boolean confirmPlay;
        String nextMove;
        boolean endGame = false;
        String opposing = "enemy";
        String heroName;

        //ask if the user is ready to start
        //ask user for their name
        //hero - display enemy stats and hero stats: example - health, attack,
        //hero actions:  attack - decreases enemy health, drink potion - add to hero health, run - ends the game;
        //keep asking for user input until enemy health is

        confirmPlay = userInput.yesNo("Would you like to play a role player game? (y/n)");
//        System.out.println(playGame);

        if (confirmPlay) {
            heroName = userInput.getString("Great, Please enter a name");
            Hero hero = new Hero(heroName, 100);
            hero.showInfo();
            Enemy enemy = new Enemy(opposing, 100);
            enemy.showInfo();
            do {
                nextMove = userInput.getString("What would you like to do next?  a = attack, d = drink potion, r = run");
//                System.out.println(nextMove);
                if (nextMove.equalsIgnoreCase("a")) {
//                    hero.attack();
                    System.out.println(hero.getHeroName() + " decreased the enemy's health by 5 points");
                    enemy.attacked();

                } else if (nextMove.equalsIgnoreCase("d")) {
                    hero.drinkPotion();


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

