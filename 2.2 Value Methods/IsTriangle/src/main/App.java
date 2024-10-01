package main;
import java.util.Scanner;

/**
 * @Author: Liam Shelston
 * @version 1.0 9/29/24
 * This program takes in three sides of a triangle and determines if they can form a triangle.
 */


public class App {
    /**
     * This is the main method that takes in three sides lengths of a triangle and calls the isTriangle method.
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        int a = input.nextInt();
        System.out.println("Enter side 2: ");
        int b = input.nextInt();
        System.out.println("Enter side 3: ");
        int c = input.nextInt();
        if (isTriangle(a, b, c)) {
            System.out.println("The sides can form a triangle.");
        } else {
            System.out.println("The sides can not form a triangle.");
        }
        input.close();
    }


    public static boolean isTriangle(int a, int b, int c) {
        /**
         * This method takes in three sides of a triangle and determines if they can form a triangle.
         */
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }
}
