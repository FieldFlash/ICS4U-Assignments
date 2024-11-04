package main;

import java.util.Random;
import java.util.Scanner;

import actors.Hero;
import actors.Villain;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        clear();
        System.out.print("Enter the name of the hero: ");
        String heroName = input.nextLine();

        System.out.print("Enter the name of the villain: ");
        String villainName = input.nextLine();

        System.out.println("Generating characters...");
        Hero hero = new Hero(heroName, rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1);
        Villain villain = new Villain(villainName, rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1);
        pause(1);

        System.out.println("Characters generated!");
        pause(1);
        System.out.println("\n" + hero.toString());
        System.out.println("\n" + villain.toString());

        pause(1);
        System.out.println("Ready to start? (y/n)");
        String response = input.nextLine(); 
        if (response.equals("y")) {
            startSequence();
            clear();
        } else {
            System.out.println("Goodbye!");
            System.exit(0);
        }

        input.close();
    }
    
    public static void fight(Hero hero, Villain villain) {
        System.out.println(hero.getName() + " is fighting " + villain.getName());
        if (hero.getStrength() > villain.getStrength()) {
            System.out.println(hero.getName() + " has successfully defeated the villain!");
        } else {
            System.out.println(villain.getName() + " has defeated the hero!");
        }
    }

    public static void stats(Hero hero, Villain villain) {
        System.out.println(hero.toString());
        System.out.println(villain.toString());
    }

    public static void startSequence(){

    }

    public static void clear(){
        System.out.print("\033[H\033[2J");
    }

    public static void pause(int time) throws InterruptedException{
        Thread.sleep(time * 1000);
    }
}
