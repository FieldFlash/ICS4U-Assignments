package actors;

public class Villain extends Person{
    private static int numOfVillains = 0;

    public Villain(String name, int strength, int health, int speed) {
        super(name, strength, health, speed);
        numOfVillains++;
    }

    public Villain() {
        this("Villain", 10, 10, 10);
        numOfVillains++;
    }

    public int getNumOfVillains() {
        return numOfVillains;
    }

    public String toString() {
        return "Villain " + getName() + " has strength: " + getStrength() + ", health: " + getHealth() + ", and speed: " + getSpeed();
    }

    public boolean runAway(Hero hero) throws InterruptedException {
        System.out.println(getName() + " is trying to run away from " + hero.getName());
        Thread.sleep(500);
        if (getSpeed() > hero.getSpeed()) {
            System.out.println(getName() + " has successfully run away from " + hero.getName() + " but is know a coward!");
            return true;
        } else {
            System.out.println(hero.getName() + " has caught up to " + getName() + " and the fight continues!");
            return false;
        }
    }
}
