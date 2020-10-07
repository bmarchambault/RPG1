package consoleAdventureGame;

public class Hero extends AdventureGamePlayer {
    private String heroName;
    private int heroHealth;

    public Hero(String player, int health) {
        super( player, health);
    }

//    public String setHeroName(){
//        heroName = userInput.getString("Great, Please enter a name");
//        return heroName;
//    }
//    public String getHeroName() {
//        return heroName;
//    }


    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public void showInfo() {
        System.out.println(
                "Hero's Name: " + heroName + '\n' +
                "Hero's Health = " + heroHealth);
    }

    public void drinkPotion() {
        System.out.println("You increased your health by 15 points");
        heroHealth += 15;
        remainingHealth();
    }

    @Override
    public void defend() {
        System.out.println("You've defended the enemy's attack.  You've prevented 3 damage points");
        heroHealth -= 2;
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
