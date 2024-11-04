package actors;

public class Person {
    private String name;
    private int strength;
    private int health;
    private int speed;
    
    public Person(String name2, int strength2, int health2, int speed2) {
        name = name2;
        strength = strength2;
        health = health2;
        speed = speed2; 
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public String getName(){
        return name;
    }

    public int getStrength(){
        return strength;
    }

    public int getHealth(){
        return health;
    }

    public int getSpeed(){
        return speed;
    }
}
