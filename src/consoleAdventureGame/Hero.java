package consoleAdventureGame;
import util.Input;

public class Hero extends AdventureGame {
    private String herosName;

    public Hero() {
       setHerosName();

    }

    public String setHerosName(){
        herosName = userInput.getString("Great, Please enter a name");
        return herosName;
    }
    public String getHerosName() {
        return herosName;
    }



    public void showInfo() {
        System.out.println(
                "Heros Name: " + herosName + '\n' +
                "Heros Health = " + herosHealth);
    }

    public void drinkPotion() {
        System.out.println("You increased your health by 15 points");
        herosHealth += 15;
        remainingHealth();
    }

    @Override
    public void defend() {
        System.out.println("You've defended the enemy's attack.  You've prevented 3 damage points");
        herosHealth -= 2;
        remainingHealth();
    }

    public void run() {
        System.out.println("Game over, you lose");
        System.out.println("Better luck next time");
        endGame = true;
    }


    @Override
    public void attacked() {
        System.out.println("the enemy has retaliated with an attack you lose 5 health.");
        remainingHealth();
        randomNumber = getRandomNumber(10, 1);
        if(randomNumber == 3) {
            defend();
        }else if(randomNumber == 6){

        }
    }



    @Override
    public void remainingHealth() {
        System.out.println("You have " + herosHealth + " health.");
    }


}
