package consoleAdventureGame;
import util.Input;

public class Hero extends AdventureGame {

    public Hero() {
       herosName = userInput.getString("Great, Please enter a name");

    }


    public void showInfo() {
        System.out.println(
                "Heros Name: " + herosName + '\n' +
                "Heros Health = " + herosHealth);
    }

    public void drinkPotion() {
        System.out.println("You increased your health by 15 points");
        herosHealth += 15;
    }


    public void run() {
        System.out.println("Game over, you lose");
        System.out.println("Better luck next time");
        endGame = true;
    }


    @Override
    public  void attacked() {
        System.out.println("the enemy has retaliated with an attack you lose 5 health.");
        herosHealth -= 5;
    }

    @Override
    public String getHerosName() {
        return this.herosName;
    }

    ;

    @Override
    public void remainingHealth() {
        System.out.println("You have " + herosHealth + " health.");

    }
}
