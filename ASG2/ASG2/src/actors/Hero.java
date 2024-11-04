package actors;

public class Hero extends Person {
    private static int numOfHeroes = 0;

    
    public Hero(String name, int strength, int health, int speed) {
        super(name, strength, health, speed);
        numOfHeroes++;
    }

    public Hero() {
        this("Hero", 10, 10, 10);
        numOfHeroes++;
    }

    public int getNumOfHeroes() {
        return numOfHeroes;
    }

    public String toString() {
        return "Hero " + getName() + " has strength: " + getStrength() + ", health: " + getHealth() + ", and speed: " + getSpeed();
    }

    public void runAway(Villain villain) throws InterruptedException {
        System.out.println(getName() + " is trying to run away from " + villain.getName());
        Thread.sleep(500);
        System.out.println("Blashphemy! A hero never runs away!");
    }
}