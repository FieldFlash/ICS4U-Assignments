package actors;

/**
 * @author Liam Shelston
 * @version 1.0
 * Person class, used as a parent class for the Hero and Villain classes
 */
public class Person {
    private String name;
    private int strength;
    private int health;
    private int speed;
    
    /**
     * Constructor for the Person class, takes in a name, strength, health, and speed
     * @param name2
     * @param strength2
     * @param health2
     * @param speed2
     */
    public Person(String name2, int strength2, int health2, int speed2) {
        name = name2;
        strength = strength2;
        health = health2;
        speed = speed2; 
    }

    /**
     * Setter for the name variable
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Setter for the strength variable
     * @param strength
     */
    public void setStrength(int strength){
        this.strength = strength;
    }

    /**
     * Setter for the health variable
     * @param health
     */
    public void setHealth(int health){
        this.health = health;
    }

    /**
     * Setter for the speed variable
     * @param speed
     */
    public void setSpeed(int speed){
        this.speed = speed;
    }

    /**
     * Getter for the name variable
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Getter for the strength variable
     * @return strength
     */
    public int getStrength(){
        return strength;
    }

    /**
     * Getter for the health variable
     * @return health
     */
    public int getHealth(){
        return health;
    }

    /**
     * Getter for the speed variable
     * @return speed
     */
    public int getSpeed(){
        return speed;
    }
}
