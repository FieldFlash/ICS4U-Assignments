package actors;

/**
 * Hero class, inherits the Person class and has a static variable to keep track of the number of heroes created
 * @author Liam Shelston
 * @version 1.0
 * */
public class Hero extends Person {
    private static int numOfHeroes = 0;

    /**
      * Constructor for the Hero class, takes in a name, strength, health, and speed
      * @param name
      * @param strength
      * @param health
      * @param speed
      */
    public Hero(String name, int strength, int health, int speed) {
        super(name, strength, health, speed);
        // incrementing the number of heroes
        numOfHeroes++;
    }

    /**
     * Default constructor for the Hero class, sets the name to Hero and the strength, health, and speed to 10
     */
    public Hero() {
        this("Hero", 10, 10, 10);
        // incrementing the number of heroes
        numOfHeroes++;
    }

    /**
     * Getter method for the number of heroes
     * @return numOfHeroes
     */
    public int getNumOfHeroes() {
        return numOfHeroes;
    }

    /**
     * toString method for the Hero class, returns a string containing details about the hero
     * @return String
     */
    public String toString() {
        return "Hero " + getName() + " has strength: " + getStrength() + ", health: " + getHealth() + ", and speed: " + getSpeed();
    }

    /**
     * Method for the hero to run away from a villain, prints a message and then sleeps for 500 milliseconds
     * @param villain
     * @throws InterruptedException
     */
    public void runAway(Villain villain) throws InterruptedException {
        System.out.println(getName() + " is trying to run away from " + villain.getName());
        Thread.sleep(500);
        System.out.println("Blashphemy! A hero never runs away!");
    }
}