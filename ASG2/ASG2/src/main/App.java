// package declaration
package main;

// importing custom classes
import actors.Hero;
import actors.Villain;

// importing java libraries
import java.util.Random;
import java.util.Scanner;


/**
 * Main class of the program, displays the use of the Hero and Villain classes
 * @author Liam Shelston
 * @version 1.0
 * */
public class App {
    /**
     * Main method of the program, generates a hero and villain and then displays their stats and prompts the user to start the fight
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        // creating a random object and scanner object
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        clear();

        // prompting the user to enter the names of the hero and villain
        System.out.print("Enter the name of the hero: ");
        String heroName = input.nextLine();

        System.out.print("Enter the name of the villain: ");
        String villainName = input.nextLine();


        // generating the hero and villain
        System.out.println("Generating characters...");
        Hero hero = new Hero(heroName, rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1);
        Villain villain = new Villain(villainName, rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1);
        
        pause(1);
        
        System.out.println("Characters generated!");
        pause(1);
        System.out.println("\n" + hero.toString());
        System.out.println("\n" + villain.toString());

        pause(1);
        
        // prompting the user to start the fight
        System.out.println("Ready to start? (y/n) or (q) to quit the program (or type 'stats' to see the stats of the characters)");
        String response = input.nextLine(); 

        // if the user enters y, the fight will start, otherwise the program will exit
        switch (response.toLowerCase()) {
            case "y":
                clear();
                System.out.println("Starting the fight sequence...");
                pause(2);
                clear();
                System.out.println("The fight has begun!\n");
                pause(2);
                if (fight(hero, villain)){
                    pause(1);
                    villain.escape(hero);
                } else {
                    pause(1);
                    hero.runAway(villain);
                    System.out.println("The story ends here!");
                }   break;
            case "q":
                System.out.println("Goodbye!");
                System.exit(0);
            case "stats":
                input.close();
                break;
            default:
                break;
        }
    }
    
    /**
     * Method to simulate a fight between a hero and a villain
     * @param hero accepts a hero object
     * @param villain accepts a villain object
    * @throws InterruptedException 
    */
    public static boolean fight(Hero hero, Villain villain) throws InterruptedException {
        // simulating the fight
        System.out.println(hero.getName() + " is fighting " + villain.getName());
        if (hero.getStrength() > villain.getStrength()) {
            System.out.println(hero.getName() + " has successfully landed a heavy blow on the villain!");
            pause(1);
            return true;
        } else {
            System.out.println(villain.getName() + " has knocked the hero off his feet!!");
            pause(1);
            return false;
        }
    }

    /**
     * Method to display the stats of the hero and villain
     * @param hero accepts a hero object 
     * @param villain accepts a villain object 
     */
    public static void stats(Hero hero, Villain villain) {
        // displaying the stats of the hero and villain
        System.out.println(hero.toString());
        System.out.println(villain.toString());
    }

    /**
     * Method to clear the console
     */
    public static void clear(){
        // clearing the console
        System.out.print("\033[H\033[2J");
    }

    /**
     * Method to pause the program for a specified amount of time
     * @param time
     * @throws InterruptedException
     */
    public static void pause(int time) throws InterruptedException{
        // pausing the program for a given amount of time
        Thread.sleep(time * 1000);
    }
}
