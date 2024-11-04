package actors;

/**
 * Villain class, inherits the Person class and has a static variable to keep track of the number of villains created
 * @author Liam Shelston
 * @version 1.0
 **/
public class Villain extends Person{
    // static variable to keep track of the number of villains
    private static int numOfVillains = 0;

    /**
     * Constructor for the Villain class, takes in a name, strength, health, and speed
     * @param name
     * @param strength
     * @param health
     * @param speed
     */
    public Villain(String name, int strength, int health, int speed) {
        super(name, strength, health, speed);
        numOfVillains++;
    }

    /**
     * Default constructor for the Villain class, sets the name to Villain and the strength, health, and speed to 10
     */
    public Villain() {
        this("Villain", 10, 10, 10);
        numOfVillains++;
    }

    /**
     * Getter method for the number of villains
     * @return
     */
    public int getNumOfVillains() {
        return numOfVillains;
    }

    /**
     * toString method for the Villain class, returns a string containing details about the villain
     * @return String
     */
    public String toString() {
        return "Villain " + getName() + " has strength: " + getStrength() + ", health: " + getHealth() + ", and speed: " + getSpeed();
    }

    /**
     * Method for the villain to run away from a hero, prints a message and then sleeps for 500 milliseconds
     * @param hero
     * @return
     * @throws InterruptedException
     */
    public boolean runAway(Hero hero) throws InterruptedException {
        System.out.println(getName() + " is trying to run away from " + hero.getName());
        Thread.sleep(500);
        if (getSpeed() > hero.getSpeed()) {
            System.out.println(getName() + " has successfully run away from " + hero.getName() + " but is now a coward!");
            return true;
        } else {
            System.out.println(hero.getName() + " has caught up to " + getName() + " and delivers the final blow! \nThe end!");
            return false;
        }
    }
}
